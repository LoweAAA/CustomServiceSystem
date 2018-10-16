
/***************************************************
			jCarousel
***************************************************/
jQuery.noConflict()(function($){
var $zcarousel = $('#main-carousel, #posts-carousel, #clients-carousel');

    if( $zcarousel.length ) {

        var scrollCount;
        var itemWidth;

        	if( $(window).width() < 320 ) {
           		scrollCount = 1;
            	itemWidth = 234;
        	} else if( $(window).width() < 479 ) {
            	scrollCount = 1;
            	itemWidth = 300;
        	} else if( $(window).width() < 767 ) {
            	scrollCount = 2;
            	itemWidth = 270;
        	} else if( $(window).width() < 960 ) {
            	scrollCount = 3;
            	itemWidth = 172;
        	} else if( $(window).width() < 1200 ) {
            	scrollCount = 3;
            	itemWidth = 220;            	
        	} else {
            	scrollCount = 4;
            	itemWidth = 260;
        }

        $zcarousel.jcarousel({
			   easing: 'easeInOutQuint',
        	   animation : 800,
               scroll    : scrollCount,
               setupCallback: function(carousel) {
               carousel.reload();
                },
                reloadCallback: function(carousel) {
                    var num = Math.floor(carousel.clipping() / itemWidth);
                    carousel.options.scroll = num;
                    carousel.options.visible = num;
                }
            });
        }
});

