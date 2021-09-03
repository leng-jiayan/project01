/**
 * 根据屏幕的大小等比例刷新背景图片大小
 */
//默认图片比例
var imgWidth = 4;
var imgHeight = 2.2;
var imgRatio = imgWidth/imgHeight;
//var newImgW,newImgH;
function updateBgImgSize(){
    //console.log( $(window).width()/$(window).height() > imgRatio );
    var _img = $( ".page_bg" );


    var _window = $(window);
    var _windownWidth = _window.width(), _windowHeight = _window.height();
    if( _windownWidth/_windowHeight > imgRatio ){
        _img.width( _windownWidth );
        _img.height( (_windownWidth * imgHeight)/imgWidth );
    }else{
        _img.width( (_windowHeight * imgWidth)/imgHeight );
        _img.height( _windowHeight );
    }
	

    //newImgW = _img.eq(0).width();
    //newImgH = _img.eq(0).height();

    //$("#page1Ani").css({"margin-top":-270 - ($(window).height() - newImgH)/2});
}
$(function(){
	updateBgImgSize();
    $(window).resize(function(){
        updateBgImgSize();
    });
});