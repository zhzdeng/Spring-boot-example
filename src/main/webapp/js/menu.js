/**
 * Created by 14331363 on 2016/11/2.
 */


window.onload =function() {
    $('.minus').click(function () {
        var count =  $(this).siblings('.value').val();
        count = parseInt(count);
        if (isNaN(count)) {
            count = 0;
            $(this).siblings('.value').val(0);
        }

        if (count != 0) {
            count --;
            $(this).siblings('.value').val(count);
        }
    })
    $('.plus').click(function () {
        var count =  $(this).siblings('.value').val();
        if (isNaN(count)) count = 0;
        if (count === NaN) count = 0;
        count++;
        $(this).siblings('.value').val(count);
    })
}