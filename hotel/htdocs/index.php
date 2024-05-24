<?php
      include 'config.php';
      session_start();
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="apple-touch-icon" sizes="180x180" href="fav/apple-touch-icon.png">
    <link rel="icon" type="image/png" sizes="32x32" href="fav/favicon-32x32.png">
    <link rel="icon" type="image/png" sizes="16x16" href="fav/favicon-16x16.png">
    <link rel="manifest" href="fav/site.webmanifest">
    <meta name="msapplication-TileColor" content="#da532c">
    <meta name="theme-color" content="#ffffff">
    <link rel="stylesheet" href="css/home.css">
    <title>HCMIU Hotel</title>
    <!-- boot -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    <!-- fontowesome -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css" integrity="sha512-xh6O/CkQoPOWDdYTDqeRdPCVd1SpvCA9XXcUnZS2FmJNp1coAFzvtCN9BmamE+4aHK8yyUHUSCcJHgXloTyT2A==" crossorigin="anonymous" referrerpolicy="no-referrer"/>
    <!-- sweet alert -->
    <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
    <link rel="stylesheet" href="css/roombook.css">
    <style>
      #guestdetailpanel{
        display: none;
      }
      #guestdetailpanel .middle{
        height: 475px;
      }
      #loginpanel{
        display: none;
      }
      #loginpanel .middle{
        height: 250px;
      }
    </style>
    <!-- Add map-->
    <script src="https://polyfill.io/v3/polyfill.min.js?features=default"></script>
    <link rel="stylesheet" type="text/css" href="css/style.css" />
    <script type="module" src="javascript/index.js"></script>
</head>
<body>
  <nav>
    <div class="logo" onclick="location.href='index.php';">
      
      <img class="hcmiulogo" src="./image/hcmiulogo.png" alt="logo">
      <p>&nbsp;HCMIU</p>
    </div>
    
    <ul>
      <li><a href="#firstsection">Home</a></li>
      <li><a href="#secondsection">Rooms</a></li>
      <li><a href="#thirdsection">Services</a></li>
      <?php 
      if (isset($_SESSION['usermail'])) { 
        ?>
              <div class="dashboard">
      <li><a href="booking.php"><button class="btn btn-primary">Dashboard</button></a></li></div>
            <li><a href="logout.php" title=""><button class="btn btn-danger">Logout</button></a></li>             
        <?php 
        } 
        else { 
          ?>
                <li><a href="#fourthsection">About Us</a></li>
            <li><a href="login.php" title=""><button class="btn btn-danger">Login</button></a></li>   

        <?php       
         } 
         ?>
    </ul>
  </nav>

  <section id="firstsection" class="carousel slide carousel_section" data-bs-ride="carousel">
    <div class="carousel-inner">
        <div class="carousel-item active">
            <img class="carousel-image" src="./image/image1.png">
        </div>
        <div class="carousel-item">
            <img class="carousel-image" src="./image/image2.png">
        </div>
        <div class="carousel-item">
            <img class="carousel-image" src="./image/image3.png">
        </div>
        <div class="carousel-item">
            <img class="carousel-image" src="./image/image4.png">
        </div>

        <div class="welcomeline">
          <h1 class="welcometag">Welcome To HCMIU Hotel</h1>
        </div>




      <!-- bookbox -->
      <div id="guestdetailpanel">
        <form action="" method="POST" class="guestdetailpanelform">
            <div class="head">
                <h3>RESERVATION</h3>
                <i class="fa-solid fa-circle-xmark" onclick="closebox()"></i>
            </div>
            <div class="middle">
                <div class="guestinfo">
                    <h4>Guest information</h4>
                    <input type="text" name="Name" placeholder="Your Full Name">
                    <input type="email" name="Email" placeholder="Enter Email">

                    <?php
                    $countries = array("Afghanistan", "Albania", "Algeria", "American Samoa", "Andorra", "Angola", "Anguilla", "Antarctica", "Antigua and Barbuda", "Argentina", "Armenia", "Aruba", "Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bermuda", "Bhutan", "Bolivia", "Bosnia and Herzegowina", "Botswana", "Bouvet Island", "Brazil", "British Indian Ocean Territory", "Brunei Darussalam", "Bulgaria", "Burkina Faso", "Burundi", "Cambodia", "Cameroon", "Canada", "Cape Verde", "Cayman Islands", "Central African Republic", "Chad", "Chile", "China", "Christmas Island", "Cocos (Keeling) Islands", "Colombia", "Comoros", "Congo", "Congo, the Democratic Republic of the", "Cook Islands", "Costa Rica", "Cote d'Ivoire", "Croatia (Hrvatska)", "Cuba", "Cyprus", "Czech Republic", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "East Timor", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Ethiopia", "Falkland Islands (Malvinas)", "Faroe Islands", "Fiji", "Finland", "France", "France Metropolitan", "French Guiana", "French Polynesia", "French Southern Territories", "Gabon", "Gambia", "Georgia", "Germany", "Ghana", "Gibraltar", "Greece", "Greenland", "Grenada", "Guadeloupe", "Guam", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Heard and Mc Donald Islands", "Holy See (Vatican City State)", "Honduras", "Hong Kong", "Hungary", "Iceland", "India", "Indonesia", "Iran (Islamic Republic of)", "Iraq", "Ireland", "Israel", "Italy", "Jamaica", "Japan", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Korea, Democratic People's Republic of", "Korea, Republic of", "Kuwait", "Kyrgyzstan", "Lao, People's Democratic Republic", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libyan Arab Jamahiriya", "Liechtenstein", "Lithuania", "Luxembourg", "Macau", "Macedonia, The Former Yugoslav Republic of", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Martinique", "Mauritania", "Mauritius", "Mayotte", "Mexico", "Micronesia, Federated States of", "Moldova, Republic of", "Monaco", "Mongolia", "Montserrat", "Morocco", "Mozambique", "Myanmar", "Namibia", "Nauru", "Nepal", "Netherlands", "Netherlands Antilles", "New Caledonia", "New Zealand", "Nicaragua", "Niger", "Nigeria", "Niue", "Norfolk Island", "Northern Mariana Islands", "Norway", "Oman", "Pakistan", "Palau", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Pitcairn", "Poland", "Portugal", "Puerto Rico", "Qatar", "Reunion", "Romania", "Russian Federation", "Rwanda", "Saint Kitts and Nevis", "Saint Lucia", "Saint Vincent and the Grenadines", "Samoa", "San Marino", "Sao Tome and Principe", "Saudi Arabia", "Senegal", "Seychelles", "Sierra Leone", "Singapore", "Slovakia (Slovak Republic)", "Slovenia", "Solomon Islands", "Somalia", "South Africa", "South Georgia and the South Sandwich Islands", "Spain", "Sri Lanka", "St. Helena", "St. Pierre and Miquelon", "Sudan", "Suriname", "Svalbard and Jan Mayen Islands", "Swaziland", "Sweden", "Switzerland", "Syrian Arab Republic", "Taiwan, Province of China", "Tajikistan", "Tanzania, United Republic of", "Thailand", "Togo", "Tokelau", "Tonga", "Trinidad and Tobago", "Tunisia", "Turkey", "Turkmenistan", "Turks and Caicos Islands", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", "United States", "United States Minor Outlying Islands", "Uruguay", "Uzbekistan", "Vanuatu", "Venezuela", "Vietnam", "Virgin Islands (British)", "Virgin Islands (U.S.)", "Wallis and Futuna Islands", "Western Sahara", "Yemen", "Yugoslavia", "Zambia", "Zimbabwe");
                    ?>
                    <div style="display:flex; flex-direction: row; justify-content: center; align-items: center">
                    
                    <select name="Country" class="selectinput">
						<option value selected >Select your country</option>
            
                        <?php
							foreach($countries as $key => $value):
							echo '<option value="'.$value.'">'.$value.'</option>';
                            //close your tags!!
							endforeach;
						?>
                    </select><label>&nbsp</label>
                    <label>Birth</label><label>&nbsp</label>
                    <input type ="date" name="dob" placeholder="Date Of Birth">  </div>
                    <input type="text" name="Phone" placeholder="Phone Number">
                    <input type="text" name="Address" placeholder="Address">

                </div>

                <div class="line"></div>

                <div class="reservationinfo">
                    <h4>Reservation information</h4>
                    <select name="RoomType" class="selectinput">
						<option value selected>Type Of Room</option>
                        <option value="Superior Room">SUPERIOR ROOM</option>
                        <option value="Deluxe Room">DELUXE ROOM</option>
						            <option value="Queen Room">QUEEN ROOM</option>
						            <option value="Single Room">SINGLE ROOM</option>
                        <option value="Studio Room">STUDIO ROOM</option>
                    </select>
                    <select name="Bed" class="selectinput">
						<option value selected>Capacity</option>
                        <option value="1">1</option>
                        <option value="2">2</option>
						            <option value="3">3</option>
                        <option value="4">4</option>
                    </select>

                    </select>

                    <div class="datesection">
                        <span>
                            <label for="cin"> Check-In</label>
                            <input name="cin" type ="date">
                        </span>
                        <span>
                            <label for="cin"> Check-Out</label>
                            <input name="cout" type ="date">
                        </span>
                    </div>
                </div>
            </div>
            <div class="footer">
              <?php
              if (isset($_SESSION['usermail'])) { ?>
                <button class="btn btn-success" name="guestdetailsubmit">Submit</button>
              <?php } 
              else { ?>
                <a href="login.php"><button class="btn btn-danger" onclick="location='login.php'">Please Log In To Continue</button></a>
              <?php } ?>

            </div>
        </form>

        <!-- ==== room book php ====-->
        <?php       

                
        
            if (isset($_POST['guestdetailsubmit'])) 
            {   
                $Name = $_POST['Name'];
                $Email = $_POST['Email'];
                $Country = $_POST['Country'];
                $Birth = $_POST['dob'];
                $Phone = $_POST['Phone'];
                $Address = $_POST['Address'];
                $RoomType = $_POST['RoomType'];
                $Bed = $_POST['Bed'];
                $cin = $_POST['cin'];
                $cout = $_POST['cout'];

                if($Name == "" || $Email == "" || $Country == ""){
                    echo "<script>swal({
                        title: 'Fill the proper details',
                        icon: 'error',
                    });
                    </script>";
                }
                else{
//
                  if (isset($_SESSION['usermail'])){
                    $sql = "SELECT UID FROM User WHERE email= '".$_SESSION['usermail']."'";     
                    $result = mysqli_query($conn, $sql) or 
                    die(mysql_error($conn)); 
         
                    if (!$result) die('Query failed: ' . mysqli_error($conn)); 
         
                    if (mysqli_num_rows($result) > 0 ){ 
                      $row = mysqli_fetch_assoc($result);
                      $uid = $row["UID"];
                      $_SESSION["UID"] = $uid;
                    }
                    
                    $RoomBed = (int)$Bed;
                  
                    $sql = sprintf("SELECT Room.RoomNumber FROM Room, RoomType WHERE Room.Status='Ready' AND RoomType.Name='$RoomType' AND Room.TypeID=RoomType.TypeID AND RoomType.Capacity=(%d)", $Bed);     
                    $result = mysqli_query($conn, $sql);
                    

                      if (mysqli_num_rows($result) > 0 )
                      { 
                        $row = mysqli_fetch_assoc($result);
                        $uid = $row["RoomNumber"];
                        $RoomAvailable = (int)$uid;
//

                $sta = "Pending";
                        
                $getUID = $_SESSION['UID'];
                $result2=mysqli_query($conn,"INSERT INTO Customer (UID, CName, DateOfBirth, Address, Email, Country, Phone) VALUES ($getUID, '$Name', '$Birth', '$Address', '$Email', '$Country', '$Phone')");
                $getcid = mysqli_query($conn,"SELECT CustomerID FROM Customer WHERE Email = '$Email' AND Phone = '$Phone'");
                $cid = mysqli_fetch_assoc($getcid);
                $nocid = (int)$cid['CustomerID'];
                $result3=mysqli_query($conn,"INSERT INTO Booking (CustomerID,RoomNumber,CheckinDate,CheckoutDate,NoOfDays,Status) VALUES ($nocid,'$RoomAvailable','$cin','$cout',datediff('$cout','$cin'),'$sta')");
                //$result = mysqli_query($conn, $sql);
                
                  if($result2 && $result3)
                    {
                      echo "<script>swal({
                          title: 'Reservation successful',
                          icon: 'success'
                          
                      });
                      
                      </script>";
                   
                     } 

                    else {
                      echo "<script>swal({
                        title: 'Something went wrong',
                        icon: 'error'
                    });
                      </script>";
                     
                    }
                
                   // $mysqli->query('SET AUTOCOMMIT = 1');
                  }
                  else {
                    echo "<script>swal({
                      title: 'This room is not available. Please select another room type',
                      icon: 'error',
                  });
                  </script>";
                }
                      
                }      
                else {
                  echo "<script>swal({
                    title: 'Not available. Please select another room type and capacity.',
                    icon: 'error',
                });
                </script>";
              }

              
          }
          }
        
        
            ?>
          </div>

    </div>
  </section>
    
  <section id="secondsection"> 
    <img src="./image/homeanimatebg.svg">
    <div class="ourroom">
      <h1 class="head">Our room</h1>
      <div class="roomselect">
        <div class="roombox">
          <div class="hotelphoto superior"></div>
          <div class="roomdata">
            <h2>Superior Room</h2>
            <div class="services">
              <i class="fa-solid fa-wifi"></i>
              <i class="fa-solid fa-burger"></i>
              <i class="fa-solid fa-spa"></i>
              <i class="fa-solid fa-dumbbell"></i>
              <i class="fa-solid fa-person-swimming"></i>
            </div>
            <button class="btn btn-primary bookbtn" onclick="openbookbox()">Book</button>
          </div>
        </div>
        <div class="roombox">
          <div class="hotelphoto deluxe"></div>
          <div class="roomdata">
            <h2>Deluxe Room</h2>
            <div class="services">
              <i class="fa-solid fa-wifi"></i>
              <i class="fa-solid fa-burger"></i>
              <i class="fa-solid fa-spa"></i>
              <i class="fa-solid fa-dumbbell"></i>
            </div>
            <button class="btn btn-primary bookbtn" onclick="openbookbox()">Book</button>
          </div>
        </div>
        <div class="roombox">
          <div class="hotelphoto twin"></div>
          <div class="roomdata">
            <h2>Twin Room</h2>
            <div class="services">
              <i class="fa-solid fa-wifi"></i>
              <i class="fa-solid fa-burger"></i>
              <i class="fa-solid fa-spa"></i>
            </div>
            <button class="btn btn-primary bookbtn" onclick="openbookbox()">Book</button>
          </div>
        </div>
        <div class="roombox">
          <div class="hotelphoto single"></div>
          <div class="roomdata">
            <h2>Single Room</h2>
            <div class="services">
              <i class="fa-solid fa-wifi"></i>
              <i class="fa-solid fa-burger"></i>
            </div>
            <button class="btn btn-primary bookbtn" onclick="openbookbox()">Book</button>
          </div>
        </div>
        <div class="roombox">
          <div class="hotelphoto queen"></div>
          <div class="roomdata">
            <h2>Queen Room</h2>
            <div class="services">
            <i class="fa-solid fa-wifi"></i>
              <i class="fa-solid fa-burger"></i>
              <i class="fa-solid fa-spa"></i>
              <i class="fa-solid fa-dumbbell"></i>
            </div>
            <button class="btn btn-primary bookbtn" onclick="openbookbox()">Book</button>
          </div>
          </div>
      </div>
 
  </section>

  <section id="thirdsection">
    <h1 class="head">Services</h1>
    <div class="service">
      <div class="box">
        <h2>Swiming pool</h2>
      </div>
      <div class="box">
        <h2>Spa</h2>
      </div>
      <div class="box">
        <h2>Restaurants</h2>
      </div>
      <div class="box">
        <h2>Gym</h2>
      </div>
      <div class="box">
        <h2>Room service (24h)</h2>
      </div>
    </div>
  </section>

 

  <section id="contactus">
    
    <div class="social">
      <i class="fa-brands fa-instagram"></i>
      <i class="fa-brands fa-facebook"></i>
      <i class="fa-solid fa-envelope"></i>
    </div>
    <div class="createdby">
      <h5>HCMIU</h5>
    </div>
  </section>
</body>

<script>

var bookbox = document.getElementById("guestdetailpanel");

      openbookbox = () =>{
         bookbox.style.display = "flex";
      }
        closebox = () =>{
         bookbox.style.display = "none";
      }
</script>
</html>