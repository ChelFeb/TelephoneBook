$(document).ready(function() {
    $("#simpleBtn").click(function(e) {
        $('#addPerson').lightbox_me({
            centered: true,
            onLoad: function() {}
        });
        e.preventDefault();
    });



    $("tbody").mousemove(function() {
        var buttons = $(this).find("button");
        buttons.css("opacity" , 0.8);
    });
    $("tbody").mouseout(function() {
        var buttons = $(this).find("button");
        buttons.css("opacity" , 0.3);
    });

});
