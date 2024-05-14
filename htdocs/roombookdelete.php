<?php

include 'config.php';

$id = $_GET['id'];
$bookid = (int)$id;
$result = mysqli_query($conn, "SELECT CustomerID FROM Booking WHERE Booking.BookingID = $bookid AND Booking.Status = 'Pending'");
$row = mysqli_fetch_assoc($result);
$cid = (int)$row["CustomerID"];
$deletesql = "DELETE FROM Booking WHERE Booking.BookingID = $bookid";
$result = mysqli_query($conn, $deletesql);
mysqli_query($conn, "DELETE FROM Customer WHERE Customer.CustomerID = $cid");
header("Location:roombook.php");

?>