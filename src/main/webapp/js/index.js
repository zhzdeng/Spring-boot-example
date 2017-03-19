window.onload = function () {

    $('#login').click(function() {
        window.location.href = "login.html";
    })

    $('.recommend').click(function() {
        var dt = event.target.name;
        window.location.href = "cuisine_detail/detail.html?name="+dt;

    })
}
