<?php

include 'config.php';

$id = $_GET['id'];

$deletesql = "DELETE FROM Booking WHERE id = $id";

$result = mysqli_query($conn, $deletesql);

header("Location:roombook.php");

?>