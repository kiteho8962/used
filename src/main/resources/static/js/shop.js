
function getImages() {
    $.ajax({
        type: "get",
        url: "/api/image",
        dataType: "json"
    }).done(res => {
        console.log(res.data.content);
        res.data.content.forEach(image => {
            let imageItem = getImageItem(image);
            $("#product-item").append(imageItem);
        })
    }).fail(error => {
        console.log(error);
    });
}

getImages();

function getImageItem(image) {
    let item = `
        <div class="col-md-4" >
            <div class="product-item">
                <div id="modalDiv" className="product-thumb" style="cursor: pointer" data-toggle="modal" data-target="#product-modal${image.id}" data-id="${image.id}">
                <img className="img-responsive" src="/upload/${image.imageUrl}" alt="product-img" style="width: 360px; height: 432px;" />
                <div className="preview-meta">
                    <ul>
                        <li>
        \t\t\t\t\t\t\t\t\t<span >
        \t\t\t\t\t\t\t\t\t\t<i className="tf-ion-ios-search-strong"></i>
        \t\t\t\t\t\t\t\t\t</span>
                        </li>
                        <li>
                            <a href="#!"><i className="tf-ion-ios-heart"></i></a>
                        </li>
                        <li>
                            <a href="#!"><i className="tf-ion-android-cart"></i></a>
                        </li>
                    </ul>
                </div>
            </div>
            <div className="product-content">
                <h4><a href="product-single.jsp">${image.title}</a></h4>
                <p className="price">${image.price}</p>
            </div>
        </div>
    </div>
    <!-- Modal -->
\t\t<div class="modal product-modal fade" id="product-modal${image.id}">
\t\t\t<button type="button" class="close" data-dismiss="modal" aria-label="Close">
\t\t\t\t<i class="tf-ion-close"></i>
\t\t\t</button>
\t\t  \t<div class="modal-dialog " role="document">
\t\t    \t<div class="modal-content">
\t\t\t      \t<div class="modal-body">
\t\t\t        \t<div class="row">
\t\t\t        \t\t<div class="col-md-8 col-sm-6 col-xs-12">
\t\t\t        \t\t\t<div class="modal-image">
\t\t\t\t        \t\t\t<img class="img-responsive" src="/upload/${image.imageUrl}" alt="product-img" />
\t\t\t        \t\t\t</div>
\t\t\t        \t\t</div>
\t\t\t        \t\t<div class="col-md-4 col-sm-6 col-xs-12">
\t\t\t        \t\t\t<div class="product-short-details">
\t\t\t        \t\t\t\t<h2 class="product-title">${image.title}</h2>
\t\t\t        \t\t\t\t<p class="product-price">${image.price}</p>
\t\t\t        \t\t\t\t<p class="product-short-description">
\t\t\t        \t\t\t\t\t${image.message}
\t\t\t        \t\t\t\t</p>
\t\t\t        \t\t\t\t<a href="cart.jsp" class="btn btn-main">Add To Cart</a>
\t\t\t        \t\t\t\t<a href="/pages/product-single" class="btn btn-transparent">View Product Details</a>
\t\t\t        \t\t\t</div>
\t\t\t        \t\t</div>
\t\t\t        \t</div>
\t\t\t        </div>
\t\t    \t</div>
\t\t  \t</div>
\t\t</div><!-- /.modal -->
    `;
    return item;
}

