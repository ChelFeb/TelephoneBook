$(document).ready(function () {
    $("#simpleBtn").click(function (e) {
        $('#addPerson').lightbox_me({
            centered: true,
            onLoad: function () {
            }
        });
        e.preventDefault();
    });

    $(".deleteBtn").click(function () {
        $("#deletePerson").val($(this).attr("userId"));
        $("#deletePerson").click();
    });


    $("tbody").mousemove(function () {
        var buttons = $(this).find("button");
        buttons.css("opacity", 0.8);
    });
    $("tbody").mouseout(function () {
        var buttons = $(this).find("button");
        buttons.css("opacity", 0.3);
    });

    $("#search").change(function () {
        searchUsers($("#search").val());


    });


});

function searchUsers(login) {
    $.getJSON("/TelephoneBook/searchPersons", { searchInitial: login})
        .done(function (foundList) {
            for (var i = 0; i < foundList.length; i++) {
                var data = {user: foundList[i]};
                console.log(data);
            }
        })
        .fail(function () {
            alert("Ошибка при обновлении списка");
        });
}

