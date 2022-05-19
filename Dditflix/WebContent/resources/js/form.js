function numberMaxLength(e){
	if(e.value.length > e.maxLength){
		e.value = e.value.slice(0, e.maxLength);
		alert("십억 이하로 입력하세요.");
       return;
	}
}

$('input[type="number"]').change(function(){
  if($(this).val() == '') return;
  if($(this).hasClass('rejectZero')){
	  if($(this).val() <= 0){
	        alert('0 이하는 입력되지 않습니다.');
	        $(this).val('');
	         return;
	  }
  }
  else {
      if($(this).val() < 0){
        alert('음수는 입력되지 않습니다.');
        $(this).val('');
         return;
	  }
  }
});

$("input[type='TEXT']").keyup(function(e){
  var length = $(this).val().length;
  var keyCode = event.keyCode;
  var maxLen = 45;
  // Backsapce, Delete
  if(keyCode == 8 || keyCode == 46 || keyCode == 37 || keyCode == 38 || keyCode == 39 || keyCode == 40 || keyCode == 16 || keyCode == 16 ) {
    return;
  }
  if(length >= maxLen) {
    event.returnValue = false;
    alert(maxLen+"자 이하로 입력하세요.");
     return;
  }
});

$("textarea").keyup(function(e){

	var data = $(this).data();

    var length = $(this).val().length;
    var keyCode = event.keyCode;

    var maxLen = data.maxLen;

    if(maxLen == 'undefined' || maxLen == undefined){
    	maxLen = 500;
    } else if(maxLen == 0){
    	return;
    }

    // Backsapce, Delete
    if(keyCode == 8 || keyCode == 46 || keyCode == 37 || keyCode == 38 || keyCode == 39 || keyCode == 40 || keyCode == 16 || keyCode == 16 ) {
      return;
    }
    if(length >= maxLen) {
      event.returnValue = false;
      alert(maxLen+"자 이하로 입력하세요.");
         return;
    }

});

 function dataLengthCheck(maxLen){
    var length = $(this).val().length;
    var keyCode = event.keyCode;
    // Backsapce, Delete
    if(keyCode == 8 || keyCode == 46 || keyCode == 37 || keyCode == 38 || keyCode == 39 || keyCode == 40 || keyCode == 16 || keyCode == 16 ) {
      return;
    }
    if(length >= maxLen) {
      event.returnValue = false;
      alert(maxLen+"자 이하로 입력하세요.");
      return;
    }
 }