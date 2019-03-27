<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"rel="stylesheet">
<title>The Atoi Algorithm</title>
<meta charset="ISO-8859-1">
</head>
<body>
<div class="container">
<form method="post">
<h3>Insert your String</h3>
	<input name="input" type="text"/>
	<input class="btn btn-success" type="submit" value="Convert to integer"/><br>
	<p><font color="green">${resultMessage} ${result}</font><p/>
</div>
<div class="container">	
	<p>
	The function first discards as many whitespace characters as necessary until the first non-whitespace character is found. Then, starting from this character, takes an optional initial plus or minus sign followed by as many numerical digits as possible, and interprets them as a numerical value.
	<p>

<p>
The string can contain additional characters after those that form the integral number, which are ignored and have no effect on the behavior of this function.
<p/>
If the first sequence of non-whitespace characters in str is not a valid integral number, or if no such sequence exists because either str is empty or it contains only whitespace characters, no conversion is performed.
<p>
If no valid conversion could be performed, a zero value is returned.
</p>
Note:
<p>
Only the space character ' ' is considered as whitespace character.
Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. If the numerical value is out of the range of representable values, INT_MAX (231 − 1) or INT_MIN (−231) is returned.
</div>
<div class="container">	
Example 1: </br>
Input: "42" <br>
Output: 42 <br>
</div>
<br>
<div class="container">	
Example 2: </br>
Input: "   -42" <br>
Output: -42 <br>
Explanation: The first non-whitespace character is '-', which is the minus sign.
             Then take as many numerical digits as possible, which gets 42.
</div>
<br>
<div class="container">	
Example 3:<br>
Input: "4193 with words"</br>
Output: 4193 </br>
Explanation: Conversion stops at digit '3' as the next character is not a numerical digit.
</div>
<br>
<div class="container">
Example 4:
<br>
Input: "words and 987" <br>
Output: 0 <br>
Explanation: The first non-whitespace character is 'w', which is not a numerical 
             digit or a +/- sign. Therefore no valid conversion could be performed.
</div>
<br>
<div class="container">
Example 5:
<br>
Input: "-91283472332" <br>
Output: -2147483648 <br>
Explanation: The number "-91283472332" is out of the range of a 32-bit signed integer.
             Thefore INT_MIN (−231) is returned.
</div>
</form>
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>