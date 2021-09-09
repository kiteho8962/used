function getImages() {
    $.ajax({
        type: "get",
        url: "/api/image",
        dataType: "json"
    }).done(res => {
        console.log(res);
    }).fail(error => {
        console.log(error);
    });
}

getImages();