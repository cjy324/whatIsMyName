<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="../part/mainLayoutHead.jspf"%>

<section class="section-1">
	<div class="border h-8 bg-green-300">
		최종선택
	</div>
	<div class="bg-white shadow-md rounded container mx-auto p-8 mt-8">
		${firstAnswer}
		${secondAnswer}
		${thirdAnswer}
		${fourthAnswer}
		${fifthAnswer}
	</div>
</section>

<%@ include file="../part/mainLayoutFoot.jspf"%>