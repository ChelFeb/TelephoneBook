$(document).ready(function() {
    $("#simpleBtn").click(function(e) {
        $('#addPerson').lightbox_me({
            centered: true,
            onLoad: function() {}
        });
        e.preventDefault();
    });

});
