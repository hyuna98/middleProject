<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<style>
.sub1 {
    color: red;
    font-weight: bolder;
    font-size: 2.5em;
    padding-bottom: 40px;
}

input{
	text-align: center;
    padding: 8px 0px;
    /* border-radius: 5px; */
    color: gray;
    background: none;
    border-radius: 0.7ex;
    width: 250px;
    border: 1px solid rgba(225,225,225,0.3)
}

#btn{
	background-color: #7a7a7a;
	border : none;
	color: white;
}


label {
 	display: block;
 	width: 120px;
 	align: center;
}

.width-ch{
	width:30px;
}

.btn.margin-del{
	margin-bottom:0;
}


</style>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Dditflix</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/resources/images/favicon.svg">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/reset.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/common.css">
	<link rel="stylesheet" href="<%=request.getContextPath() %>/resources/css/comm_sub.css">
	<link rel="stylesheet"	href="<%=request.getContextPath()%>/resources/css/user/myPage.css">
    <script src="${pageContext.request.contextPath}/resources/js/jquery/jquery-3.6.0.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/bootstrap/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/login/validation.js"></script>
	<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script> <!-- 주소api -->
 
 </head>
<body>
    <header id="header">
        <nav class="navbar navbar-expand-md navbar-dark">
            <a class="navbar-brand" href="../login/login.do"><img class="logo" src="../../resources/images/Netflix_logo.svg" alt=""></a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
        </nav>
    </header>
    <div class="bgBox">
        <div class="concord-img-gradient"></div>
        <section class="main">
            <div class="titleWrap mb-5">
            <div class="sub1">회원가입</div>
           		<form class="form-horizontal" method="post" onsubmit="return valid();">
					<table class="table" border="1">
						<thead class="thead">
							<tr>
								<td>
									<div class="form-group">
										<label for="id">아이디</label>
										<input type="text" class="inputId" id="id" name="users_id" autocomplete="off">
										<span class="sp"></span>
										<span id="rst"></span>
									</div>
								</td>
							</tr>
							<tr>
								<td>
									<div class="form-group">
										<label for="pass">비밀번호</label>
										<input type="password" class="inputPw" id="pw1" name="users_pw" autocomplete="off">
										<span class="sp"></span>
									</div>
								</td>
							</tr>
							<tr>
								<td>
									<div class="form-group">
										<label for="pass2">비밀번호 확인</label>
										<input type="password" class="inputPw" id="pw2" name="userPw2" autocomplete="off">
										<span class="sp"></span>
									</div>
								</td>
							</tr>
							<tr>
								<td>
									<div class="form-group">
										<label for="name">이름</label>
										<input type="text" class="" id="name" name="users_name" autocomplete="off">
										<span class="sp"></span>
									</div>
								</td>
							</tr>
							<tr>
								<td>
									<div class="form-group">
										
									
											<label>성별</label>
											<label class="btn margin-del" style="color:white;">남자</label>
												<input type="radio" class="width-ch" name="users_gender" autocomplete="off" value="M" checked>
											
											<label class="btn margin-del" style="color:white;">여자</label>
												<input type="radio" class="width-ch" name="users_gender" autocomplete="off" value="F" checked>
											
									
									
									</div>
								</td>
							</tr>
							<tr>
								<td>
									<div>
										<label for="bir">생년월일</label>
										<input type="date" class="" id="bir" name="users_bir" autocomplete="off">
										<span class="sp"></span>
									</div>
								</td>
							</tr>
							<tr>
								<td>
									<div class="form-group">
										<label for="hp">휴대폰번호</label>
										<input type="text" class="" id="hp" name="users_hp" autocomplete="off">
										<span class="sp"></span>
									</div>
								</td>
							</tr>
							<tr>
								<td>
									<div class="form-group">
										<label for="mail">이메일</label>
										<input type="email" class="" id="mail" name="users_mail" autocomplete="off">
										<span class="sp"></span>
									</div>
								</td>
							</tr>
							<tr>
								<td>
									<label for="zip">우편번호</label>
									<input type="text" class="" id="zip" name="users_zip" autocomplete="off">
									<button type="button" id="modalBtn" class="btn btn-info btn-sm" onclick="findZip();">우편검색</button>
								</td>
							</tr>
							<tr>
								<td>
									<label for="add1">주소</label>
									<input type="text" class="" id="add1" name="users_add1" autocomplete="off">
								</td>
							</tr>
							<tr>
								<td>
									<label for="add2">상세주소</label>
									<input type="text" class="" id="add2" name="users_add2" autocomplete="off">
								</td>
							</tr>
							<tr>
								<td colspan="2">
									<button type="button" id="sendBtn" class="btn btn-primary btn-sm"> 가입</button>
								</td>
							</tr>					
					</table>                   	
              </form>
            </div>
        </section>
    </div>  


<script>

let idchk = false;
let pwchk = false;
let namechk = false;
let passchk = false;
let hpchk = false;
let mailchk = false;

function valid(){
	
	event.preventDefault();	//submit 이벤트를 막아 페이지 리로드를 방지
	
	if(idchk && pwchk && namechk && passchk && hpchk && mailchk){
		let formData = $('form').serialize();
		
		
		$.ajax({
			url : '/Dditflix/user/join/join.do',
			type : 'post',
			data : formData,
			success : function(aa){
				if(aa.cd == "ok"){
					alert("Dditflix 회원가입을 축하드립니다!");
					location.href = "/Dditflix/user/login/login.do";
				}else{
					alert("공백없이 형식에 맞게 작성해주세요!");
				}
			},
			error : function(xhr){
				alert(xhr.status);
			},
			dataType : 'json'
		});		
	}
	
	
	
}

//id 중복체크 ajax
function idCheckAjax(){
	let sp = document.querySelectorAll('.sp');
	let rst = document.querySelector('#rst');

	$.ajax({
		url : '/Dditflix/user/join/idCheck.do',
		data : {'mId' : $('#id').val()},
		type : 'post',
		success : function(a){
			if(a.cd == "ok"){
				$('#rst').html(a.str).css('color','green');
				sp[0].style.display = 'none';
				rst.style.display = "inline-block";
			}else{
				$('#rst').html(a.str).css('color','red');
				sp[0].style.display = 'none';
				rst.style.display = "inline-block";
			}
		},
		error : function(xhr){
			alert(xhr.status);
		},
		dataType : 'json'
	});
}

//	아이디 중복검사 
//keyup 이벤트 : 키를 눌렀다가 떼는 순간
$('#id').on('keyup',function(){
	
	//유효성검증(validation check) - id
	let idValue = $('#id').val().trim();
	let regId = /^[a-zA-Z][a-zA-Z0-9]{3,7}$/;
	let sp = document.querySelectorAll('.sp');
	let rst = document.querySelector('#rst');
	
	//패턴체크
	if(regId.test(idValue)){
		idCheckAjax();
		idchk = true;
	} else if(idValue === ""){
		sp[0].style.display = "inline-block"
		rst.style.display = "none";
		noProc($('#id'), "아이디를 입력하세요");
		idchk = false;	
	}
	else{
		sp[0].style.display = "inline-block"
		rst.style.display = "none";
		noProc($('#id'), "영문,숫자,4~8자리 입력 가능");
		idchk = false;
	}
});

	//유효성검증 - pass
$('#pw1').on('keyup',function(){
	let passValue = $('#pw1').val().trim();
	let regPass = /^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[!@#$%^&*()_+|]).{8,}$/;
	
	if(regPass.test(passValue)){
		okProc($('#pw1'), "사용 가능한 패스워드 입니다!");
		pwchk = true;
	}else if(passValue === ""){
		noProc($('#pw1'), "패스워드를 입력하세요");
		pwchk = false;
	}else{
		noProc($('#pw1'), "대/소문자,특수문자,숫자 포함 8자리 이상 입력해야함");
		pwchk = false;
	}
});
	
//비밀번호 일치 여부 확인
$('.inputPw').on('keyup',function(){
	let pass1 = $("#pw1").val().trim();
	let pass2 = $("#pw2").val().trim();
	
	if(pass1 !="" || pass2 !=""){
		if(pass1 == pass2){
			okProc($('#pw2'), "일치");
			passchk = true;
		}else{
			noProc($('#pw2'), "불일치");
			passchk = false;
		}
	}
});

	
	 	
	

//유효성검증 - name
$('#name').on('keyup', function(){	
	let nameValue = $('#name').val().trim();
	let regName = /^[가-힣]{2,5}$/;
	
	if(regName.test(nameValue)){
		okProc($('#name'),"");
		namechk = true;
	}else if(nameValue === ""){
		noProc($('#name'), "이름을 입력하세요");
		namechk = false;
	}
	else{
		noProc($('#name'), "한글 2~5자리 입력 가능");
		namechk = false;
	}
});	

//유효성검증 - hp
$('#hp').on('keyup', function(){
	let hpValue = $('#hp').val().trim();
	let regHp = /^[0-9]{3}[0-9]{3,4}[0-9]{4}$/;
	
	if(regHp.test(hpValue)){
		okProc($('#hp'), "");
		hpchk = true;
	}else if(hpValue === ""){
		noProc($('#hp'), "전화번호를 입력하세요");
		hpchk = false;
	}
	else{
		noProc($('#hp'), "공백 없이 입력하세요");
		hpchk = false;
	}
});

//유효성검증 - mail
$('#mail').on('keyup',function(){
	let mailValue = $('#mail').val().trim();
	let regMail = /^[0-9a-zA-Z]+@[0-9a-zA-Z]+(\.[a-z]+){1,2}$/;
	
	if(regMail.test(mailValue)){
		okProc($('#mail'), "");
		mailchk = true;
	}else if(mailValue === ""){
		noProc('#mail', " 메일을 입력하세요");
		mailchk = false;
	}else{
		noProc($('#mail'), "형식에 맞게 입력하세요");
		mailchk=  false;
	}	
});

function findZip() {
new daum.Postcode({
    oncomplete: function(data) {
        // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분입니다.
             var addr = ''; // 주소 변수

            //사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.
            if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
                addr = data.roadAddress;
            } else { // 사용자가 지번 주소를 선택했을 경우(J)
                addr = data.jibunAddress;
            }

       // 우편번호와 주소 정보를 해당 필드에 넣는다.
       document.getElementById('zip').value = data.zonecode;
       document.getElementById("add1").value = addr;
       // 커서를 상세주소 필드로 이동한다.
       document.getElementById("add2").focus();
    }
}).open();
}

// 회원가입 전송
$('#sendBtn').on('click', valid)




</script>

<jsp:include page="../../common/footer.jsp" />




