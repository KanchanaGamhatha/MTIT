<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <link   href="css/bootstrap.min.css" rel="stylesheet">
    <script src="js/bootstrap.min.js"></script>
</head>

<body>
    <div class="container">
    		<div class="row">
    			<h3>PHP CRUD Grid</h3>
    		</div>
			<div class="row">
				<p>
					<a href="create.php" class="btn btn-success">Create</a>
				</p>
				
				<table class="table table-striped table-bordered table-hover">
		              <thead>
		                <tr>
		                  <th>Name</th>
		                  <th>Email Address</th>
		                  <th>Mobile Number</th>
		                  <th>Action</th>
		                </tr>
		              </thead>
		              <tbody>
		              <?php 
					   include 'database.php';
					   
					   $sql = 'SELECT * FROM customers ORDER BY id ';
	 				   $customers = mysql_query($sql);
						while($row = mysql_fetch_array($customers)) 
						{
								echo '<tr>';
							   	echo '<td>'. $row['name'] . '</td>';
							   	echo '<td>'. $row['email'] . '</td>';
							   	echo '<td>'. $row['mobile'] . '</td>';
								
								/*echo '<td><a href="read.php?id='.$row['id'].'">'. $row['name'] . '</a></td>';
							   	echo '<td><a href="read.php?id='.$row['id'].'">'. $row['email'] . '</a></td>';
							   	echo '<td><a href="read.php?id='.$row['id'].'">'. $row['mobile'] . '</a></td>';*/
							   	
								echo '<td width=250>';
							   	echo '<a class="btn" href="read.php?id='.$row['id'].'">Read</a>';
							   	echo '&nbsp;';
							   	echo '<a class="btn btn-success" href="update.php?id='.$row['id'].'">Update</a>';
							   	echo '&nbsp;';
							   	echo '<a class="btn btn-danger" href="delete.php?id='.$row['id'].'">Delete</a>';
							   	echo '</td> ';
							   	echo '</tr>';
					   }
					  ?>
				      </tbody>
	            </table>
    	</div>
    </div> <!-- /container -->
  </body>
</html>