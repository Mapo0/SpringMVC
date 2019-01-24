function Product(id, productName , productCost){
this.id=id;
this.productName=productName;
this.productCost=productCost;

let productClosure = this;
    this.getProductPrice = function() {
        return productClosure.price;
    }

    }
}
function createProducts() {
    setVisibilityAllProductChildrenToFalse();
}


function deleteProductOnClick(deleteBtn) {
    deleteProductClick(deleteBtn.parentNode.getAttribute("id"));
}
function deleteProductClick(productId) {
    $.ajax({
        type: "DELETE",
        contentType: "application/json",
        url: "products/delete/"+productId,
        cache: false,
        timeout: 600000,
        success: function (data) {
            let product = $("#"+productId);
            product.detach();
        }
    });
}
$(".createProduct").click(function (event) {
    createPopupForNewProduct();
});

}
function createProductForm(event) {
    event.preventDefault();
    let newProduct = new Product(0,
        $("input[name='text']").val(),
        $("input[name='cost']").val());
    createProductClick(newProduct);
    $(".createProduct").remove();
};

$("#createProductSubmit").click(function (event) {
    event.preventDefault();
});


function createProductClick(product) {
    $.ajax({
        type: "POST",
        contentType: "application/json",
        url: "products/",
        data: JSON.stringify(product),
        dataType: "json",
        cache: false,
        timeout: 600000,
        success: function (data) {
            new Product(data.id, data.img, data.text, data.price).createProductElementForAdmin(document.querySelector(".category"));
            $(".createProductPopup").remove();
        }
    });
}

function getProductById(productId){
    let selectedProduct = productArrayCategory.find(product => product.id == productId);
    if (selectedProduct === undefined) {
        throw new RangeError(`Продукт с id ${productId} не найден!`);
    }
    return selectedProduct;
}