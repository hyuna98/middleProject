/**
 * 
 */
$('#shbtn').on('click', function(){
	let searchVal = $('#input').val();
	
	$.ajax({
		url : '/Dditflix/user/home/search.do',
		data : {'search' : searchVal},
		method: 'get',
		success : function(code){		
			$('#modal').html(code);
		    $('#searchModal').modal('show',{backdrop: false});
		    $('#input').val('');
		},
		error : function(xhr){
			alert(xhr.status);
		},
		dataType: 'html'
	});
	
})