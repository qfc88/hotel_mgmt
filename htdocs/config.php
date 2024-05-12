<?php

$server = "20.2.128.32";
$username = "pdm";
$password = "hcmiu123";
$database = "HMS";

$conn = mysqli_connect($server,$username,$password,$database);

if(!$conn){
    die("<script>alert('connection Failed.')</script>");
} ?>