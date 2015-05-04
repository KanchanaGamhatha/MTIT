<?php
//connect to the database
	$mysql_host = "localhost";
	$mysql_user = "root";
	$mysql_pass = "";
	$mysql_db = "mtit";
	if(!mysqli_connect($mysql_host, $mysql_user, $mysql_pass, $mysql_db))// || !mysql_select_db($mysql_db)) 
	{
		die(mysql_error());
	}
	else
	{
		echo "Connected to DB <br>";
	}
?>