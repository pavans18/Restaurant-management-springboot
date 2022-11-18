<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<title>Update Item</title>
</head>
<body>
	<div class="container">
		<br>
		<h4 class="text-center text-primary">Le Gourmet Food Center</h4>

		<div class="row">
			<div class="col-md-6 offset-md-3">
				<div class="card">
					<div class="card-body">

						<h3 class="text-center text-primary">Update Food Item</h3>
						<h3 class="text-center text-secondary">*items entry is
							compulsary</h3>


						<form action="/edit" method="post" >

							<div class="form-group">
								<label>Enter Item Number</label> <input type="text"
									class="form-control" name="itemNumber"
									value="${fooditems.getItemNumber()}" readonly>


							</div>
							<div class="form-group">
								<label>Enter Item Name</label> <input type="text"
									class="form-control" name="itemName"
									value="${fooditems.getItemName()}" readonly>
							</div>

							<div class="form-group">
								<label>Enter Item Cuisine</label> <input type="text"
									class="form-control" name="cuisine"
									value="${fooditems.getCuisine()}" readonly>
							</div>

							<div class="form-group">
								<label>*Enter Item Price</label> <input type="text"
									class="form-control" name="price"
									value="${fooditems.getPrice()}">
							</div>


							<div class="form-group">
								<label>*Enter Item Availability</label> <input type="text"
									class="form-control" name="availability"
									value="${fooditems.getAvailability()}">
							</div>

							<button class="btn btn-primary btn-block">Update</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>