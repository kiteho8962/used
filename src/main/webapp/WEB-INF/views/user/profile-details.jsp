<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>

<%@include file="../layout/header.jsp"%>

<section class="page-header">
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<div class="content">
					<h1 class="page-name">ProfileDetails</h1>
					<ol class="breadcrumb">
						<li><a href="/">Home</a></li>
						<li class="active">my account</li>
					</ol>
				</div>
			</div>
		</div>
	</div>
</section>
<section class="user-dashboard page-wrapper">
  <div class="container">
    <div class="row">
      <div class="col-md-12">
        <ul class="list-inline dashboard-menu text-center">
          <li><a href="/pages/dashboard">Dashboard</a></li>
          <li><a href="/pages/order">Orders</a></li>
          <li><a href="/pages/address">Address</a></li>
          <li><a class="active"  href="/pages/profile-details">Profile Details</a></li>
        </ul>
        <div class="dashboard-wrapper dashboard-user-profile">
          <div class="media">
            <div class="pull-left text-center" href="#!">
              <img class="media-object user-img" src="/images/avater.jpg" alt="Image">
              <a href="#x" class="btn btn-transparent mt-20">Change Image</a>
            </div>
            <div class="media-body">
              <ul class="user-profile-list">
                <li><span>Full Name:</span>${principal.user.userName}</li>
                <li><span>Email:</span>${principal.user.email}</li>
                <li><span>Address</span>${principal.user.address}</li>
                <li><span>Phone:</span>${principal.user.phone}</li>
                <li><span>Create Date:</span>${principal.user.createDate}</li>
              </ul>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</section>

<%@ include file="../layout/footer.jsp"%>