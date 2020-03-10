<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 20/03/09 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  
   <div id="login_wrap">
      <h1 class="login_title">회원가입</h1>
      <form method="post" action="signUp">
         <fieldset class="step_wrap">
            <legend class="title">Step 1 : 로그인 정보</legend>
            <fieldset class="login_att">
               <label class="login_box" style="margin-right: 65px;">아이디</label>
               <input type="text" class="input_box" size="30px" name="id"
               placeholder="공백 없이 6자리 이상 14자리 이하" autofocus required>
            </fieldset>
            <fieldset class="login_att">
               <label class="login_box" style="margin-right: 52px;">비밀번호</label>
               <input type="password" class="input_box" size="30px" name="pwd"
                required>
            </fieldset>
            <fieldset class="login_att">
               <label class="login_box" style="margin-right: 18px;">비밀번호 확인</label>
               <input type="password" class="input_box" size="30px" name="checkPwd"
                required>
            </fieldset>
         </fieldset>
         <fieldset class="step_wrap">
            <legend class="title" style="padding-top: 35px;">Step 2 : 개인 정보</legend>
            <fieldset class="login_att">
               <label class="login_box" style="margin-right: 90px;">이름</label>
               <input type="text" class="input_box" size="30px" name="name"
                placeholder="5자미만 공백없이" required>
            </fieldset>
            <fieldset class="login_att">
               <label class="login_box" style="margin-right: 52px;">메일 주소</label>
               <input type="email" class="input_box" size="30px" name="e_mail"
                placeholder="abcd@domain.com"  required>
            </fieldset>
            <fieldset class="login_att">
               <label class="login_box" style="margin-right: 50px;">연락처</label>
               <select name="tel_1st" style="width: 70px; height: 28px; margin-right: 10px;">
                  <option value="010">010</option>
                  <option value="011">011</option>
                  <option value="016">016</option>
                  <option value="017">017</option>
                  <option value="018">018</option>
               </select>
               <input type="text" class="input_box" size="10px" name="tel_2nd"
                required>
                <label>-</label>
               <input type="text" class="input_box" size="10px" name="tel_3rd"
                required>
            </fieldset>
         </fieldset>
         <div id="signup_menu">
            <input type="submit" value="회원가입" class="signup_b">
            <input type="reset" value="다시작성" class="signup_b">
         </div>
      </form>
   
   </div>
   
</body>
</html>
