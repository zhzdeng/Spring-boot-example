window.onload = function () {

    $('#login').click(function() {
        var userName = $('#userName').val();
        var userPass = $('#userPassword').val();
        if (userName == "") {
            alert("用户名不能为空");   
        } else if (userPass == "") {
            alert("密码不能为空");
        }
    })
}