<?php

include 'config.php';
session_start();
error_reporting(E_ALL);
ini_set('display_errors', 1);
?>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css">
    <link rel="stylesheet" href="css/login.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <!-- sweet alert -->
    <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
    <!-- aos animation -->
    <link rel="stylesheet" href="https://unpkg.com/aos@next/dist/aos.css" />
    <!-- loading bar -->
    <script src="https://cdn.jsdelivr.net/npm/pace-js@latest/pace.min.js"></script>

    <title>HCMIU Hotel</title>
</head>

<body>

    <div class="container" id="container">
        <div class="form-container sign-up">
            <form method="POST">
                <h1>Create Account</h1>
                <input type="text" placeholder="Username" name="Username">
                <input type="Email" placeholder="Email" name="Email">
                <input type="Password" placeholder="Password" name="Password">
                <input type="password" placeholder="Confirm Password" name="CPassword">
                <button type="submit" name="user_signup_submit">Sign Up</button>
            </form>
        </div>
			

	<!-- // ==userlogin== -->

        <div class="form-container sign-in">

            <form id="userlogin" action="" method="POST">
                <h1>Sign In</h1>
                <input type="email" name="Email" placeholder="Email">
                <input type="password" name="Password" placeholder="Password">
                <button type="submit" name="user_login_submit">Sign In</button>
            </form>
        </div>

        <div class="toggle-container">
            <div class="toggle">
                <div class="toggle-panel toggle-left">
                    <h1>Already have Account?</h1>
                    <p>Sign in now to book room</p>
                    <button class="hidden" id="login">Sign In</button>
                </div>
                <div class="toggle-panel toggle-right">
                    <h1>Don't have Account?</h1>
                    <p>Register with your email</p>
                    <button class="hidden" id="register">Sign Up</button>
                </div>
            </div>
        </div>
    </div>

    <!-- // ==userlogin== -->
                <?php 
    
                if (isset($_POST['user_login_submit'])) {
                    $Email = $_POST['Email'];
                    $Password = $_POST['Password'];
                    $sql = "SELECT * FROM User WHERE Email = '$Email' AND Password ='$Password'";
                    $result = mysqli_query($conn, $sql);
            
                    if ($result && $result->num_rows > 0) {
                        $_SESSION['usermail'] = $Email;

                        header("Location: index.php");
                        
                    } else {
                        echo "<script>swal({
                            title: 'Something went wrong',
                            icon: 'error',
                        });
                        </script>";
                    }
                }
                ?>  
                 <!--============ signup =============-->
            <?php       


                if (isset($_POST['user_signup_submit'])) {
                    $Username = $_POST['Username'];
                    $Email = $_POST['Email'];
                    $Password = $_POST['Password'];
                    $CPassword = $_POST['CPassword'];
            
                    if ($Username == "" || $Email == "" || $Password == "" || $CPassword == "") {
                        echo "<script>swal({
                            title: 'Fill the proper details',
                            icon: 'error',
                        });
                        </script>";
                    } else {
                        if ($Password==$CPassword) {
                            $sql = "SELECT * FROM User WHERE Email = '$Email' OR Username = '$Username'";
                            $result = mysqli_query($conn, $sql);
            
                            if ($result ->num_rows > 0) {
                                echo "<script>swal({
                                    title: 'Email/Username already exits',
                                    icon: 'error',
                                });
                                </script>";
                            } else {
                                $sql = "INSERT INTO User (Username, Email, Password) VALUES ('$Username', '$Email', '$Password')";
                                $result = mysqli_query($conn, $sql);
            
                                if ($result) {
                                    $_SESSION['usermail'] = $Email;
                                    $Username = "";
                                    $Email = "";
                                    $Password = "";
                                    $CPassword = "";
                                    header("Location: index.php");
                                   
                                } else {
                                    echo "<script>swal({
                                        title: 'Something went wrong',
                                        icon: 'error',
                                    });
                                    </script>";
                                }
                            }
                        } else {
                            echo "<script>swal({
                                title: 'Password does not matched',
                                icon: 'error',
                            });
                            </script>";
                        }
                    }
                }
            ?>
    <script src="javascript/login.js"></script>
</body>

</html>