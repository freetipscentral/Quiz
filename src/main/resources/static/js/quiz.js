$(function(){
	$('#submitButton').click(function(e){
	    alert("Submit button paragraph was clicked.");
	    $('#actionRequired').val('submitButton');
	});

	$('#showNextQuestion').click(function(e){
		e.preventDefault();
	    $('#actionRequired').val('nextQuestion');
	    $('#quizForm').submit();
	});

	$('#showPreviousQuestion').click(function(e){
		e.preventDefault();
	    $('#actionRequired').val('previousQuestion');
	    $('#quizForm').submit();
	});
	
});
