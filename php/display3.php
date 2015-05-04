<!DOCTYPE html>
<html >
<head>
	<meta charset="utf-8">
    <link   href="bootstrap.min.css" rel="stylesheet">
    <script src="bootstrap.min.js"></script>
<title>Comments on MTIT</title>
</head>
<body>
<div class="container">
<?php
require 'db_connect.php';
?>
<?php
if(isset($_POST["fullname"]) && isset($_POST["regNo"]) && isset($_POST["comment"]))
{
	$name = $_POST["fullname"];
	$regNumber = $_POST["regNo"];
	$comment = $_POST["comment"];
}
else
{
	$error = "One or more fields are not filled";
	echo $error;
}

if(isset($_POST["Insert"]))
{
	$insertString = "INSERT INTO ITA_Comments VALUES('$regNumber','$name','$comment')";
	if(!mysql_query($insertString)) 
	{
		die('Error : '.mysql_error());
	} 
	else 
	{
		echo '<br/>';
		echo '1 record added...';
	}
}
else if (isset($_POST["Update"]))
{
	$updateString = "UPDATE ITA_Comments SET name='$name',
	comment='$comment' WHERE regNumber='$regNumber'";
	if(!mysql_query($updateString)) 
	{
		die('Error : '.mysql_error());
	} 
	else 
	{
		echo '<br/>';
		echo '1 record updated...';
	}
}
else if (isset($_POST["Delete"]))
{
	$updateString = "DELETE FROM ITA_Comments WHERE regNumber='$regNumber'";
	if(!mysql_query($updateString)) 
	{
		die('Error : '.mysql_error());
	} 
	else 
	{
		echo '<br/>';
		echo '1 record deleted...';
	}
}
?>
<table class="table table-bordered table-hover">
<tr>
<td class="label-success"><b> ID </td>
<td class="label-success"><b> Name </td>
<td class="label-success"><b> Comment </td>
</tr>
<?php
	$selectString = "SELECT * FROM ITA_Comments";
	$comments = mysql_query($selectString);
	while($row = mysql_fetch_array($comments)) 
	{ ?>
		<tr>
		<td> <?php echo $row['regNumber']; ?> </td>
		<td> <?php echo $row['name']; ?> </td>
		<td> <?php echo $row['comment']; ?> </td>
		</tr>
	<?php
	}
?>
</table>
</div>
</body>
</html>
