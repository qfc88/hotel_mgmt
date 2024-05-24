<?php

include 'config.php';
session_start();

// page redirect
$usermail="";
$usermail=$_SESSION['usermail'];
if($usermail == true){

}else{
  header("location: index.php");
}

?>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/booking.css">
    <!-- loading bar -->
    <script src="https://cdn.jsdelivr.net/npm/pace-js@latest/pace.min.js"></script>
    <link rel="stylesheet" href="css/flash.css">
    <!-- fontowesome -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css" integrity="sha512-xh6O/CkQoPOWDdYTDqeRdPCVd1SpvCA9XXcUnZS2FmJNp1coAFzvtCN9BmamE+4aHK8yyUHUSCcJHgXloTyT2A==" crossorigin="anonymous" referrerpolicy="no-referrer"/>
    <title>HCMIU User Dashboard</title>
</head>

<body>
    <!-- mobile view -->
    <div id="mobileview">
        <h5>Dashboard doesn't show in mobile view</h4>
    </div>
  
    <!-- nav bar -->
    <nav class="uppernav">
        <div class="logo">
            <a href="index.php">
            <img class="hcmiulogo" src="image/hcmiulogo.png" alt="logo"></a>
            <p> <div onclick="location.href='index.php';" style="display:flex; flex-direction: row; justify-content: center; align-items: center">HCMIU</div></p>
            
        </div>
        <div class="logout">
        <a href="logout.php"><button class="btn btn-primary">Logout</button></a>
        </div>
    </nav>
    <nav class="sidenav">
        <ul>
            <li class="pagebtn active"><img src="image/icon/bed.png">&nbsp&nbsp&nbsp Dashboard</li>
        </ul>
    </nav>

    <!-- main section -->
    <div class="mainscreen">
        <iframe class="frames frame1 active" src="roombook.php" frameborder="0"></iframe>

    </div>
</body>

<script src="./javascript/script.js"></script>

</html>
