<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src='/assets/js/annyang.min.js'></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/SpeechKITT/0.3.0/speechkitt.min.js"></script>
<script>


	annyang.start({
		autoRestart : true,
		continuous : true
	})
	
	// Tell KITT to use annyang
  SpeechKITT.annyang();

  // Define a stylesheet for KITT to use
  SpeechKITT.setStylesheet('//cdnjs.cloudflare.com/ajax/libs/SpeechKITT/0.3.0/themes/flat.css');

  // Render KITT's interface
  SpeechKITT.vroom();
	
	var recognition = annyang.getSpeechRecognizer();
	var final_transcript = '';
	recognition.interimResults = true;
	recognition.onresult = function(event) {
		var interim_transcript = '';
		final_transcript = '';
		for (var i = event.resultIndex; i < event.results.length; ++i) {
			if (event.results[i].isFinal) {
				final_transcript += event.results[i][0].transcript;
				console.log("final_transcript=" + final_transcript);
				//annyang.trigger(final_transcript); //If the sentence is "final" for the Web Speech API, we can try to trigger the sentence
			} else {
				interim_transcript += event.results[i][0].transcript;
				console.log("interim_transcript=" + interim_transcript);
			}
		}
		document.getElementById('result').innerHTML = '중간값:='+ interim_transcript + '<br/>결과값=' + final_transcript;
		console.log('interim=' + interim_transcript + '|final='+ final_transcript);
	};
</script>
</head>
<body class="" id="grid">
	<br />
	<br /> 한국어 음성 처리 테스트
	<br />
	<br />
	<div id='result'>결과가 없습니다.</div>
</body>
</html>