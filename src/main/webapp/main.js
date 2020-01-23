/**
 * Main Javascript File
 */

var data = '';

function getCarData(){
	$.ajax({
		method: 'GET',
		url: 'rest/test/getCarData',
		dataType: 'json',
		success: renderTable(data),
		error: function(jqXHR, textStatus, errorThrown){},
		timeout: 180000
	});
}

function renderTable(){
	$('#table').bootstrapTable({
		url: "rest/test/getCarData",
//		pagination: true,
		search: true
			});
}

getCarData();

