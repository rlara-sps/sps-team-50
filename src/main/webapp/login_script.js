const TAs = new Set(["test1", "test2"]);

var today = new Date();
var expiry = new Date(today.getTime() + 30 * 24 * 3600 * 1000); // plus 30 days

/**
 * Helper method to create a cookie
 */
function setCookie(name, value){
    document.cookie=name + "=" + escape(value) + "; path=/; expires=" + expiry.toGMTString();
}

/**
 * Creates two cookies based on user form input, 
 * one for their email and one representing if they are a TA.
 */
function putCookie(form) {
    const emailAddress = form[0].email.value;
    const isTA = TAs.has(email);
    setCookie("email", emailAddress);
    setCookie("isTA", isTA);
    //alert("document.cookie = " + document.cookie);
    window.location.href='/index.html';
    return true;
  }
