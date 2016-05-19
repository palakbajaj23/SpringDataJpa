$(document).ready(

function() {

	$("#loginform").validate({
		rules : {

			"username" : {
				required : true,
				usernamecheck : true
			},

			"password" : {
				required : true,
				passwordcheck : true

			}

		},
		messages : {

			"username" : {
				required : "Please enter username",
				usernamecheck : "Enter valid username"

			},
			"password" : {
				required : "Please enter password",

			}

		},

	});

	$.validator.addMethod("usernamecheck", function(value, element) {
		return /^[A-Za-z][A-Za-z0-9]+$/.test(value);
	});
	
});