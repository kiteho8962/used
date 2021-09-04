<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>

<section class="page-header">
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<div class="content">
					<h1 class="page-name">상품 등록</h1>
					<ol class="breadcrumb">
						<li><a href="/">Home</a></li>
						<li class="active">regist</li>
					</ol>
				</div>
			</div>
		</div>
	</div>
</section>

<section class="page-wrapper">
	<div class="contact-section">
		<div class="container">
			<div class="row">
				<!-- Contact Form -->
				<div class="contact-form col-md-6 " >
					<form id="contact-form" method="post" action="/image" enctype="multipart/form-data">
					
						<div class="form-group">
							<input type="text" placeholder="상품 제목" class="form-control" name="title" id="name">
						</div>
						
						<div class="form-group">
							<input type="email" placeholder="이메일" class="form-control" name="email" id="email">
						</div>
						
						<div class="form-group">
							<input type="text" placeholder="가격" class="form-control" name="price" id="subject">
						</div>

						<div id="imageBigWrapper" class="form-group">
							<input type="file" name="file" onchange="imageChoose(this)">
							<div class="imageWrapper">
								<img src="" alt="" id="imageUploadPreview" style="width: 55%; margin-top: 2%;"/>
							</div>
						</div>
						
						<div class="form-group">
							<textarea rows="6" placeholder="Message" class="form-control" name="message" id="message"></textarea>
						</div>
						
						<div id="mail-success" class="success">
							Thank you. The Mailman is on His Way :)
						</div>
						
						<div id="mail-fail" class="error">
							Sorry, don't know what happened. Try later :(
						</div>
						
						<div id="cf-submit">
							<input type="submit" id="contact-submit" class="btn btn-transparent" value="Submit">
						</div>						
						
					</form>
				</div>
				<!-- ./End Contact Form -->
				
				<!-- Contact Details -->
				<div class="contact-details col-md-6 " >
					<div class="google-map">
						<div id="map"></div>
					</div>
					<ul class="contact-short-info" >
						<li>
							<i class="tf-ion-ios-home"></i>
							<span>${principal.user.userName}</span>
						</li>
						<li>
							<i class="tf-ion-android-phone-portrait"></i>
							<span>Phone: ${principal.user.phone}</span>
						</li>
						<li>
							<i class="tf-ion-android-mail"></i>
							<span>Email: ${principal.user.email}</span>
						</li>
					</ul>
					<!-- Footer Social Links -->
					<div class="social-icon">
						<ul>
							<li><a class="fb-icon" href="https://www.facebook.com/themefisher"><i class="tf-ion-social-facebook"></i></a></li>
							<li><a href="https://www.twitter.com/themefisher"><i class="tf-ion-social-twitter"></i></a></li>
							<li><a href="https://themefisher.com/"><i class="tf-ion-social-dribbble-outline"></i></a></li>
							<li><a href="https://themefisher.com/"><i class="tf-ion-social-googleplus-outline"></i></a></li>
							<li><a href="https://themefisher.com/"><i class="tf-ion-social-pinterest-outline"></i></a></li>
						</ul>
					</div>
					<!--/. End Footer Social Links -->
				</div>
				<!-- / End Contact Details -->
					
				
			
			</div> <!-- end row -->
		</div> <!-- end container -->
	</div>
</section>
<script src="/js/upload.js" ></script>
<%@ include file="../layout/footer.jsp"%>