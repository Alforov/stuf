(function (lib, img, cjs, ss) {

var p; // shortcut to reference prototypes
lib.webFontTxtFilters = {}; 

// library properties:
lib.properties = {
	width: 728,
	height: 90,
	fps: 30,
	color: "#FFFFFF",
	opacity: 1.00,
	webfonts: {},
	manifest: [
		{src:"images/logo.png", id:"logo"},
		{src:"images/pic1_728.jpg", id:"pic1_728"},
		{src:"images/pic2_728.jpg", id:"pic2_728"},
		{src:"images/pic3_728.jpg", id:"pic3_728"},
		{src:"images/product.png", id:"product"}
	]
};



lib.ssMetadata = [];


lib.webfontAvailable = function(family) { 
	lib.properties.webfonts[family] = true;
	var txtFilters = lib.webFontTxtFilters && lib.webFontTxtFilters[family] || [];
	for(var f = 0; f < txtFilters.length; ++f) {
		txtFilters[f].updateCache();
	}
};
// symbols:



(lib.logo = function() {
	this.initialize(img.logo);
}).prototype = p = new cjs.Bitmap();
p.nominalBounds = new cjs.Rectangle(0,0,179,39);


(lib.pic1_728 = function() {
	this.initialize(img.pic1_728);
}).prototype = p = new cjs.Bitmap();
p.nominalBounds = new cjs.Rectangle(0,0,552,90);


(lib.pic2_728 = function() {
	this.initialize(img.pic2_728);
}).prototype = p = new cjs.Bitmap();
p.nominalBounds = new cjs.Rectangle(0,0,553,272);


(lib.pic3_728 = function() {
	this.initialize(img.pic3_728);
}).prototype = p = new cjs.Bitmap();
p.nominalBounds = new cjs.Rectangle(0,0,554,90);


(lib.product = function() {
	this.initialize(img.product);
}).prototype = p = new cjs.Bitmap();
p.nominalBounds = new cjs.Rectangle(0,0,288,182);


(lib.white = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// Слой 1
	this.shape = new cjs.Shape();
	this.shape.graphics.f("#FFFFFF").s().p("AkwUYMAAAgovIJhAAMAAAAovg");
	this.shape.setTransform(30.5,130.5);

	this.timeline.addTween(cjs.Tween.get(this.shape).wait(1));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(0,0,61,261);


(lib.whirl = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// Слой 1
	this.shape = new cjs.Shape();
	this.shape.graphics.f("#FFFFFF").s().p("AGJCDIAAkFIAnAAIAAEFgAEACDIAAirIAjAAIAAAdQAKgRATgIQAUgJAYABIAAAmQgYgDgTAJQgRAHgJATIAABpgACpCDIAAirIAnAAIAACrgABVCDIAAhmQAAgVgMgIQgLgKgRAAQgMAAgJAEQgJAFgHAEQgHAGgDAHIAABzIgmAAIAAj6IAmAAIAABjQAHgLAPgGQAOgHASAAQAWgBAQAKQAQAIAIARQAJAOAAAUIAABrgAjACDIg6i6Ig6C6IgtAAIhOj6IAsAAIA6DKIA9jKIAkAAIA9DKIA6jKIAtAAIhPD6gACshPQgHgFAAgMQAAgMAHgFQAHgGAKABQAJgBAHAGQAHAFAAAMQAAAMgHAFQgHAGgJAAQgKAAgHgGg");
	this.shape.setTransform(43.3,13.2);

	this.timeline.addTween(cjs.Tween.get(this.shape).wait(1));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(0,0,86.5,26.3);


(lib.txt5_3 = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// Слой 1
	this.shape = new cjs.Shape();
	this.shape.graphics.f("#FFFFFF").s().p("AgbA/QgRgIgLgQQgKgQAAgXQAAgRAGgNQAGgNAKgJQAKgJAMgEQAMgEAKAAQAUAAANAHQAOAHAIAMQAHAMACAPQACAOgDANIhjAAQACAMAHAHQAIAIALADQAJAEAMAAQANAAAKgDQALgCAJgFIAAAaQgJAFgNACQgMACgOAAQgTAAgRgHgAgPgoQgJADgFAIQgGAIAAALIBIAAQABgGgDgIQgDgIgHgGQgIgGgPAAQgIAAgJAEg");
	this.shape.setTransform(82.7,76.3);

	this.shape_1 = new cjs.Shape();
	this.shape_1.graphics.f("#FFFFFF").s().p("AAjBDIgjgwIghAwIgjAAIA0hDIgxhCIAiAAIAfAuIAgguIAiAAIgxBCIA0BDg");
	this.shape_1.setTransform(67.8,76.3);

	this.shape_2 = new cjs.Shape();
	this.shape_2.graphics.f("#FFFFFF").s().p("AgyBjIgJgCIAAgaIAHACIAHAAQALAAAIgHQAIgIAGgQIADgHIhAiFIAgAAIAsBjIAnhjIAgAAIg/CWQgHASgHAKQgJAKgJAFQgKAEgKAAIgJAAg");
	this.shape_2.setTransform(52.8,79.5);

	this.shape_3 = new cjs.Shape();
	this.shape_3.graphics.f("#FFFFFF").s().p("AA1BVIAAgkIhqAAIAAAkIgcAAIAAg9IASAAQANgVAFgZQAEgbAAgjIBnAAIAABsIAUAAIAAA9gAgSgMQgEATgJARIA/AAIAAhTIgtAAQgBAbgEAUg");
	this.shape_3.setTransform(36.1,78.1);

	this.shape_4 = new cjs.Shape();
	this.shape_4.graphics.f("#FFFFFF").s().p("AghBEQgNgDgJgFIAAgaIANAGIARADIAQACQAJAAAIgCQAIgBAFgEQAFgEAAgIQAAgGgEgEQgEgEgHgBIgLgBIgbAAIAAgVIAbAAQAJAAAHgDQAHgEAAgIQAAgJgJgEQgIgFgNAAQgMAAgMAEQgNADgJAEIAAgZQAKgGANgCQANgDAOgBQASABANAFQANAFAHAJQAGAJAAALQgBAMgGAIQgHAHgKADQALACAIAHQAHAJAAANQAAARgQAMQgQALgdgBQgPAAgNgCg");
	this.shape_4.setTransform(20.4,76.3);

	this.shape_5 = new cjs.Shape();
	this.shape_5.graphics.f("#FFFFFF").s().p("AgiA+QgRgIgKgPQgKgQAAgXQAAgWAKgPQAKgQARgIQAQgIASAAQATAAAQAIQARAIAKAQQAKAPAAAWQAAAXgKAQQgKAPgRAIQgQAIgTAAQgSAAgQgIgAgdgeQgMAMAAASQAAAUAMALQALAMASAAQASAAAMgMQALgLABgUQgBgSgLgMQgMgMgSAAQgSAAgLAMg");
	this.shape_5.setTransform(5.4,76.3);

	this.shape_6 = new cjs.Shape();
	this.shape_6.graphics.f("#FFFFFF").s().p("Ag8BDIAAiFIBLAAQAUABALAJQALAKAAAQQAAALgFAIQgFAIgJADQAKACAGAHQAHAIAAANQAAAKgEAJQgFAIgKAFQgKAFgPAAgAgeAsIAoAAQAJAAAGgEQAGgDAAgKQAAgKgGgEQgHgEgIABIgoAAgAgegKIAmAAQAIAAAGgDQAFgEAAgJQAAgKgGgDQgGgEgHAAIgmAAg");
	this.shape_6.setTransform(-10.2,76.3);

	this.shape_7 = new cjs.Shape();
	this.shape_7.graphics.f("#FFFFFF").s().p("Ag8BDIAAiFIBLAAQAUABALAJQALAKAAAQQAAALgFAIQgFAIgJADQAKACAGAHQAHAIAAANQAAAKgEAJQgFAIgKAFQgKAFgPAAgAgeAsIAoAAQAJAAAGgEQAGgDAAgKQAAgKgGgEQgHgEgIABIgoAAgAgegKIAmAAQAIAAAGgDQAFgEAAgJQAAgKgGgDQgGgEgHAAIgmAAg");
	this.shape_7.setTransform(-32.1,76.3);

	this.timeline.addTween(cjs.Tween.get({}).to({state:[{t:this.shape_7},{t:this.shape_6},{t:this.shape_5},{t:this.shape_4},{t:this.shape_3},{t:this.shape_2},{t:this.shape_1},{t:this.shape}]}).wait(1));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(-42.2,0,134.6,92);


(lib.txt4_3 = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// Слой 1
	this.shape = new cjs.Shape();
	this.shape.graphics.f("#FFFFFF").s().p("Ag8BDIAAiFIBLAAQAUABALAJQALAKAAAQQAAALgFAIQgFAIgJADQAKACAGAHQAHAIAAANQAAAKgEAJQgFAIgKAFQgKAFgPAAgAgeAsIAoAAQAJAAAGgEQAGgDAAgKQAAgKgGgEQgHgEgIABIgoAAgAgegKIAmAAQAIAAAGgDQAFgEAAgJQAAgKgGgDQgGgEgHAAIgmAAg");
	this.shape.setTransform(217.5,46.3);

	this.shape_1 = new cjs.Shape();
	this.shape_1.graphics.f("#FFFFFF").s().p("AgiA+QgRgIgKgPQgKgQAAgXQAAgWAKgPQAKgQARgIQAQgIASAAQATAAAQAIQARAIAKAQQAKAPAAAWQAAAXgKAQQgKAPgRAIQgQAIgTAAQgSAAgQgIgAgdgeQgMAMAAASQAAAUAMALQALAMASAAQASAAAMgMQALgLABgUQgBgSgLgMQgMgMgSAAQgSAAgLAMg");
	this.shape_1.setTransform(201.2,46.3);

	this.shape_2 = new cjs.Shape();
	this.shape_2.graphics.f("#FFFFFF").s().p("AAhBDIAAg2IhBAAIAAA2IgeAAIAAiFIAeAAIAAA2IBBAAIAAg2IAeAAIAACFg");
	this.shape_2.setTransform(184.6,46.3);

	this.shape_3 = new cjs.Shape();
	this.shape_3.graphics.f("#FFFFFF").s().p("AgbA/QgRgIgLgQQgKgQAAgXQAAgRAGgNQAGgNAKgJQAKgJAMgEQAMgEAKAAQAUAAANAHQAOAHAIAMQAHAMACAPQACAOgDANIhjAAQACAMAHAHQAIAIALADQAJAEAMAAQANAAAKgDQALgCAJgFIAAAaQgJAFgNACQgMACgOAAQgTAAgRgHgAgPgoQgJADgFAIQgGAIAAALIBIAAQABgGgDgIQgDgIgHgGQgIgGgPAAQgIAAgJAEg");
	this.shape_3.setTransform(168.8,46.3);

	this.shape_4 = new cjs.Shape();
	this.shape_4.graphics.f("#FFFFFF").s().p("AgxBDIAAiFIBjAAIAAAbIhFAAIAABqg");
	this.shape_4.setTransform(155.6,46.3);

	this.shape_5 = new cjs.Shape();
	this.shape_5.graphics.f("#FFFFFF").s().p("AhHBjIAAjCIAbAAIAAAVQAHgKANgHQANgHAQAAQAVAAAPAKQAOAJAJAQQAIAQAAATQAAAUgIAOQgJAQgOAKQgPAJgVAAQgPAAgMgGQgMgGgHgJIAABPgAgRhEQgIAEgHAGQgGAHgDAHIAAAhQADAHAGAFQAHAGAIAEQAIAEAJAAQASAAAMgMQALgKABgVQgBgTgLgNQgMgMgSAAQgJAAgIAEg");
	this.shape_5.setTransform(140.5,49.2);

	this.shape_6 = new cjs.Shape();
	this.shape_6.graphics.f("#FFFFFF").s().p("AgbA/QgRgIgLgQQgKgQAAgXQAAgRAGgNQAGgNAKgJQAKgJAMgEQAMgEAKAAQAUAAANAHQAOAHAIAMQAHAMACAPQACAOgDANIhjAAQACAMAHAHQAIAIALADQAJAEAMAAQANAAAKgDQALgCAJgFIAAAaQgJAFgNACQgMACgOAAQgTAAgRgHgAgPgoQgJADgFAIQgGAIAAALIBIAAQABgGgDgIQgDgIgHgGQgIgGgPAAQgIAAgJAEg");
	this.shape_6.setTransform(123.8,46.3);

	this.shape_7 = new cjs.Shape();
	this.shape_7.graphics.f("#FFFFFF").s().p("Ag9BDIgJgCIAAgYIAEABIAEAAQAMAAAGgNQAGgOAEgYQADgYABgiIBlAAIAACFIgeAAIAAhrIgrAAQgCAggFAXQgFAagKAOQgKAOgSAAIgJgBg");
	this.shape_7.setTransform(107,46.4);

	this.shape_8 = new cjs.Shape();
	this.shape_8.graphics.f("#FFFFFF").s().p("Ag9BDIgJgCIAAgYIAEABIAEAAQAMAAAGgNQAGgOAEgYQADgYABgiIBlAAIAACFIgeAAIAAhrIgrAAQgCAggFAXQgFAagKAOQgKAOgSAAIgJgBg");
	this.shape_8.setTransform(90.3,46.4);

	this.shape_9 = new cjs.Shape();
	this.shape_9.graphics.f("#FFFFFF").s().p("AguBCQgLgFgHgJQgGgJAAgOQAAgRAJgKQAJgIAOgEQANgEAPAAIAPABIASADIAAgFQgBgMgIgIQgJgIgQAAQgPAAgMADQgMADgJAEIAAgbIAWgGQANgDAQAAQAbAAARAOQAQAOABAeIAAAvQAAAFACACQADADAEgBIAFAAIAEgBIAAAVQgEACgFABIgKABQgJAAgHgEQgHgEgEgIQgJAIgNAFQgLAEgPAAQgNAAgKgEgAgVAHQgIACgFAFQgFAFgBAIQABAKAHAFQAHAFALAAQAKAAAIgEQALgEAIgIIAAgWIgOgDIgOgBQgIAAgIACg");
	this.shape_9.setTransform(75.2,46.3);

	this.shape_10 = new cjs.Shape();
	this.shape_10.graphics.f("#FFFFFF").s().p("AgNBDIAAhqIgvAAIAAgbIB5AAIAAAbIgvAAIAABqg");
	this.shape_10.setTransform(54,46.3);

	this.shape_11 = new cjs.Shape();
	this.shape_11.graphics.f("#FFFFFF").s().p("AgiA+QgRgIgKgPQgKgQAAgXQAAgWAKgPQAKgQARgIQAQgIASAAQATAAAQAIQARAIAKAQQAKAPAAAWQAAAXgKAQQgKAPgRAIQgQAIgTAAQgSAAgQgIgAgdgeQgMAMAAASQAAAUAMALQALAMASAAQASAAAMgMQALgLABgUQgBgSgLgMQgMgMgSAAQgSAAgLAMg");
	this.shape_11.setTransform(39,46.3);

	this.timeline.addTween(cjs.Tween.get({}).to({state:[{t:this.shape_11},{t:this.shape_10},{t:this.shape_9},{t:this.shape_8},{t:this.shape_7},{t:this.shape_6},{t:this.shape_5},{t:this.shape_4},{t:this.shape_3},{t:this.shape_2},{t:this.shape_1},{t:this.shape}]}).wait(1));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(22,0,204.9,92);


(lib.txt3_3 = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// Слой 1
	this.shape = new cjs.Shape();
	this.shape.graphics.f("#FFFFFF").s().p("AAiBDIAAgsIgfAAIgfAsIgjAAIAlgwQgOgFgIgLQgHgJgBgOQABgNAFgKQAGgKAMgGQALgHARAAIBEAAIAACFgAgSgjQgHAFAAAKQAAAKAHAFQAHAFALAAIAiAAIAAgpIgiAAQgLAAgHAGg");
	this.shape.setTransform(211.3,16.3);

	this.shape_1 = new cjs.Shape();
	this.shape_1.graphics.f("#FFFFFF").s().p("AgiBcQgQgJgJgRQgJgSgBgbQABggALgXQALgWATgMQAOgIANgEIAWgGQALgBAJgEQAJgDAHgGIAAAdQgHAFgIACQgIADgIABIgSAEQgJADgKAGQgMAHgHAMQgGAMgDALQAHgKAMgHQAMgGAOAAQARAAAOAHQAPAJAIAMQAJAPAAAUQAAAWgJAOQgJAPgQAHQgQAIgUAAQgSAAgQgJgAgUACQgJAGgFAJQgEAJAAAKQAAAKAEAJQAFAJAIAFQAJAGAMAAQANAAAJgGQAJgFAEgJQAEgJAAgKQAAgLgEgJQgEgJgJgFQgJgEgNAAQgMAAgIAEg");
	this.shape_1.setTransform(196.1,13.2);

	this.shape_2 = new cjs.Shape();
	this.shape_2.graphics.f("#FFFFFF").s().p("AgbA/QgRgIgLgQQgKgQAAgXQAAgRAGgNQAGgNAKgJQAKgJAMgEQAMgEAKAAQAUAAANAHQAOAHAIAMQAHAMACAPQACAOgDANIhjAAQACAMAHAHQAIAIALADQAJAEAMAAQANAAAKgDQALgCAJgFIAAAaQgJAFgNACQgMACgOAAQgTAAgRgHgAgPgoQgJADgFAIQgGAIAAALIBIAAQABgGgDgIQgDgIgHgGQgIgGgPAAQgIAAgJAEg");
	this.shape_2.setTransform(180.3,16.3);

	this.shape_3 = new cjs.Shape();
	this.shape_3.graphics.f("#FFFFFF").s().p("AgLBCQgNgEgKgJQgLgIgGgNQgGgNAAgSQAAgRAGgOQAHgNAKgJQALgJAOgEQALgEANAAQALAAALACQAKADAJAFIAAAcQgHgGgKgDQgKgDgKAAQgMAAgIAFQgMAEgGAKQgIAKABAOQgBAPAIAKQAGAJALAFQAIAFAMAAQAMAAAJgDQALgDAIgFIAAAcQgKAFgLACQgLACgMAAQgOAAgLgEg");
	this.shape_3.setTransform(165.6,16.3);

	this.shape_4 = new cjs.Shape();
	this.shape_4.graphics.f("#FFFFFF").s().p("AAhBDIAAhWIhGBWIgaAAIAAiFIAfAAIAABWIBGhWIAZAAIAACFg");
	this.shape_4.setTransform(143.9,16.3);

	this.shape_5 = new cjs.Shape();
	this.shape_5.graphics.f("#FFFFFF").s().p("AgNBDIAAhqIgvAAIAAgbIB5AAIAAAbIgvAAIAABqg");
	this.shape_5.setTransform(129,16.3);

	this.shape_6 = new cjs.Shape();
	this.shape_6.graphics.f("#FFFFFF").s().p("AAhBDIAAhWIhGBWIgaAAIAAiFIAfAAIAABWIBGhWIAZAAIAACFg");
	this.shape_6.setTransform(114.2,16.3);

	this.shape_7 = new cjs.Shape();
	this.shape_7.graphics.f("#FFFFFF").s().p("ABNBVIAAgkIi1AAIAAiFIAeAAIAABqIAzAAIAAhqIAcAAIAABqIAzAAIAAhqIAdAAIAABrIAUAAIAAA+g");
	this.shape_7.setTransform(94.5,18.1);

	this.shape_8 = new cjs.Shape();
	this.shape_8.graphics.f("#FFFFFF").s().p("AguBCQgLgFgHgJQgGgJAAgOQAAgRAJgKQAJgIAOgEQANgEAPAAIAPABIASADIAAgFQgBgMgIgIQgJgIgQAAQgPAAgMADQgMADgJAEIAAgbIAWgGQANgDAQAAQAbAAARAOQAQAOABAeIAAAvQAAAFACACQADADAEgBIAFAAIAEgBIAAAVQgEACgFABIgKABQgJAAgHgEQgHgEgEgIQgJAIgNAFQgLAEgPAAQgNAAgKgEgAgVAHQgIACgFAFQgFAFgBAIQABAKAHAFQAHAFALAAQAKAAAIgEQALgEAIgIIAAgWIgOgDIgOgBQgIAAgIACg");
	this.shape_8.setTransform(74.5,16.3);

	this.shape_9 = new cjs.Shape();
	this.shape_9.graphics.f("#FFFFFF").s().p("AgnBiQgRgDgSgGIAAggQASAJARADQARADARAAQAKAAAMgDQAKgCAIgIQAGgGABgNQAAgMgGgGQgHgHgKgCQgKgDgKABIgpAAIAAgbIAmAAQARAAAKgHQALgHAAgNQAAgPgMgHQgMgFgTAAQgPAAgPACQgPAEgQAIIAAgfQAQgHAPgDQAQgDARAAQATAAARAFQARAHAKALQAJAMAAARQABASgKAKQgIAMgOAEQAKADAJADQAIAHAGAKQAHAKAAAQQAAAQgIALQgGAKgMAHQgMAGgOAEQgNACgNAAQgSAAgSgDg");
	this.shape_9.setTransform(57.8,13.2);

	this.timeline.addTween(cjs.Tween.get({}).to({state:[{t:this.shape_9},{t:this.shape_8},{t:this.shape_7},{t:this.shape_6},{t:this.shape_5},{t:this.shape_4},{t:this.shape_3},{t:this.shape_2},{t:this.shape_1},{t:this.shape}]}).wait(1));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(47.1,0,174.6,32);


(lib.product2 = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// Слой 1
	this.instance = new lib.product();

	this.timeline.addTween(cjs.Tween.get(this.instance).wait(1));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(0,0,288,182);


(lib.nasal = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// Слой 1
	this.shape = new cjs.Shape();
	this.shape.graphics.f("#FFFFFF").s().p("ADZCAQgOgGgJgMQgIgMgBgRQABgWAMgNQAMgNARgFQASgGASABIAWABIAXAEIAAgGQgBgRgKgIQgNgKgVAAQgUAAgPAEQgQAEgMAFIAAgjQAKgEASgEQASgDAUgBQAmAAAVASQAVATAAAlIAAA+QABAHADADQAEADAFgBIAGAAIAGgCIAAAcQgGACgGABIgNABQgMAAgJgFQgJgEgFgLQgMALgQAFQgRAGgTAAQgQAAgOgFgAD5A0QgKADgHAGQgHAGABALQAAANAJAGQAKAHANAAQANAAANgGQAOgFAKgKIAAgdIgSgDIgTgCQgMAAgKADgAA1CBQgSgEgNgIIAAgiQAOAJASAEQARAFARAAQAQAAALgEQAKgDABgLQgBgJgLgFQgJgGgQgEQgPgEgQgGQgQgGgKgLQgLgLAAgSQAAgRAKgLQALgMAPgFQAQgFARAAQASAAAPAEQARAEAMAHIAAAgQgHgDgKgEQgKgEgLgCQgLgCgKAAQgJAAgHACQgHACgFAEQgFAEAAAFQABAKAKAFQALAFAPAEIAfALQAPAFALALQAKALABATQgBATgKALQgLALgQAFQgSAEgTAAQgTAAgSgEgAiUCAQgOgGgJgMQgIgMgBgRQACgWALgNQALgNASgFQARgGATABIAXABIAWAEIAAgGQAAgRgLgIQgMgKgXAAQgTAAgQAEQgPAEgMAFIAAgjQAKgEASgEQASgDAUgBQAmAAAVASQAVATAAAlIAAA+QAAAHAEADQAEADAFgBIAGAAIADgCIAAAcQgDACgGABIgNABQgMAAgJgFQgJgEgFgLQgMALgRAFQgPAGgVAAQgPAAgOgFgAh0A0QgKADgHAGQgGAGAAALQAAANAJAGQAJAHAOAAQANAAANgGQANgFALgKIAAgdIgSgDIgTgCQgMAAgKADgAGOCBIAAkFIAmAAIAAEFgAkDCBIiHi3IAAAOIAAAOIAACbIgqAAIAAj6IAnAAICIC2IgBgNIAAgPIAAiaIAqAAIAAD6g");
	this.shape.setTransform(43.7,13.4);

	this.timeline.addTween(cjs.Tween.get(this.shape).wait(1));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(0,0,87.4,26.8);


(lib.logo_1 = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// Слой 2
	this.instance = new lib.logo();
	this.instance.setTransform(9,25,0.885,0.885);

	this.timeline.addTween(cjs.Tween.get(this.instance).wait(1));

	// Слой 1
	this.shape = new cjs.Shape();
	this.shape.graphics.f("#FFFFFF").s().p("At1HCIAAuDIbrAAIAAODg");
	this.shape.setTransform(88.7,45);

	this.timeline.addTween(cjs.Tween.get(this.shape).wait(1));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(0,0,177.4,90);


(lib.booster = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// Слой 1
	this.shape = new cjs.Shape();
	this.shape.graphics.f("#FFFFFF").s().p("AF8B2QgWgKgNgUQgOgVAAgeQAAgYAIgPQAHgRANgLQANgLAQgGQAPgFAPAAQAaAAASAJQARAJAKAQQAKAPACARQADASgEATIiDAAQADAQAKAJQAJAKAOAFQAPAEAQAAQAPAAAOgDQAOgEAMgFIAAAhQgNAGgPADQgQADgSAAQgbAAgWgKgAGLgPQgKAFgIAKQgHAIgBAPIBgAAQACgJgEgKQgEgIgKgIQgKgIgTAAQgNAAgMAFgADpB6QgNgGgIgNQgHgMgBgUIAAhVIgeAAIAAgiIAeAAIAAg0IAmgJIAAA9IA/AAIAAAiIg/AAIAABNQABARAHAHQAJAHAQAAQAJAAAJgCQAJgCAIgDIAAAhQgKAEgMACIgYACQgRAAgOgGgAAtB8QgRgFgNgIIAAgiQANAJATAFQARAEAQAAQARABAKgEQALgEAAgKQAAgJgLgGQgKgFgQgFQgPgEgQgGQgPgGgLgLQgKgKAAgRQAAgTAKgLQAKgLAQgFQAPgFASAAQASAAAPAEQAQAEAMAGIAAAiQgHgFgJgDQgKgEgMgCQgLgCgKAAQgIgBgIACQgGACgFAEQgFAEAAAHQABAIAJAFQALAGAPAEIAgAKQAOAGALALQAKALABASQgBATgJALQgLAMgRAEQgRAFgTAAQgUAAgSgEgAiZB2QgUgLgOgUQgNgUAAgeQAAgeANgSQAOgVAUgKQAWgKAYAAQAZAAAVAKQAVAKANAVQANASABAeQgBAegNAUQgNAUgVALQgVAKgZAAQgYAAgWgKgAiSgCQgPANgBAaQABAaAPAOQAPAPAYABQAZgBAPgPQAPgOAAgaQAAgagPgNQgPgPgZAAQgYAAgPAPgAlvB2QgUgLgNgUQgOgUAAgeQAAgeAOgSQANgVAUgKQAWgKAZAAQAYAAAWAKQAUAKANAVQANASABAeQgBAegNAUQgNAUgUALQgWAKgYAAQgZAAgWgKgAlogCQgPANgBAaQABAaAPAOQAPAPAZABQAYgBAPgPQAOgOABgaQgBgagOgNQgPgPgYAAQgZAAgPAPgAIbB7IAAirIAiAAIAAAdQAKgQAUgJQATgJAYACIAAAmQgYgDgSAJQgSAHgIASIAABpgAqFB7IAAj6IBqAAQAbAAATAHQAUAHALAOQAKAPAAAVQAAAPgGALQgFAMgJAHQgJAHgKADQALAEALAFQAMAHAHANQAIANAAATQAAAWgJANQgKAOgOAIQgOAHgRADQgQADgQAAgApcBXIA+AAQAPABANgDQANgCAIgIQAJgJAAgRQAAgQgIgJQgIgIgMgDQgMgDgMABIhEAAgApcgWIBDAAQAMAAAKgEQAJgDAHgIQAFgHAAgNQAAgSgNgIQgNgIgWAAIg+AAg");
	this.shape.setTransform(64.7,12.8);

	this.timeline.addTween(cjs.Tween.get(this.shape).wait(1));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(0,0,129.3,25.7);


(lib.blue = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// Слой 1
	this.shape = new cjs.Shape();
	this.shape.graphics.f("#007AB3").s().p("AyqByIAAjjMAlVAAAIAADjg");
	this.shape.setTransform(119.5,10.8);

	this.timeline.addTween(cjs.Tween.get(this.shape).wait(1));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(0,-0.6,239,23);


(lib.Символ8 = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// Слой 1
	this.shape = new cjs.Shape();
	this.shape.graphics.f("#FFFFFF").s().p("AjKBWIAAgkIhsAAIAAAkIgcAAIAAg8IASAAQAMgVAFgZQAFgbAAgjIBpAAIAABsIAUAAIAAA8gAkTgKQgFASgIASIBBAAIAAhUIgvAAQgBAbgEAVgAC+AuQgQgIgKgQQgLgPAAgWQAAgXALgPQAKgRAQgHQARgJATAAQATAAARAJQAQAHAKARQAKAPABAXQgBAWgKAPQgKAQgQAIQgRAIgTAAQgTAAgRgIgADDguQgLAMgBATQABATALALQAMAMATAAQATAAALgMQAMgLAAgTQAAgTgMgMQgLgMgTAAQgTAAgMAMgAh1AuQgRgIgKgQQgKgPAAgWQAAgXAKgPQAKgRARgHQAQgJATAAQAUAAAQAJQARAHAKARQAKAPAAAXQAAAWgKAPQgKAQgRAIQgQAIgUAAQgTAAgQgIgAhwguQgMAMAAATQAAATAMALQALAMATAAQATAAAMgMQALgLABgTQgBgTgLgMQgMgMgTAAQgTAAgLAMgAHDAyIAAhZIgmA5IgSAAIgmg5IAABZIgdAAIAAiEIAeAAIAuBHIAuhHIAeAAIAACEgABqAyIgjgvIgjAvIgiAAIA0hCIgxhCIAiAAIAgAtIAggtIAjAAIgyBCIA0BCgAnfAyIAAiEIBNAAQAUAAALAKQALAKAAAQQAAALgFAIQgFAHgJAFQAKADAGAHQAHAGAAAMQAAALgEAIQgFAIgKAGQgKAEgPAAgAnBAcIAqAAQAJAAAGgEQAGgDAAgKQAAgLgGgBQgHgEgIAAIgqAAgAnBgaIAoAAQAIAAAGgEQAFgDAAgJQAAgKgGgEQgGgEgHABIgoAAg");
	this.shape.setTransform(48.1,8.7);

	this.timeline.addTween(cjs.Tween.get(this.shape).wait(1));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(0,0,96.2,17.4);


(lib.Символ7 = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// Слой 1
	this.shape = new cjs.Shape();
	this.shape.graphics.f("#FFFFFF").s().p("ABxBWIAAgkIhsAAIAAAkIgaAAIAAg8IASAAQAKgVAFgZQAFgbgBgjIBqAAIAABsIAUAAIAAA8gAAogKQgFASgJASIBBAAIAAhUIgvAAQgBAbgDAVgAlwAxQgLgEgGgJQgHgJABgOQAAgPAJgKQAJgKANgEQAOgEAOAAIASABIARADIAAgFQAAgNgJgHQgJgJgRABQgPAAgMACQgNADgIAFIAAgcIAVgGQAOgCAQgBQAdABARAOQAQAOAAAeIAAAvQAAAFADACQADACAEAAIAEAAIAFgBIAAAVQgEACgFAAIgKACQgJgBgHgEQgHgDgEgIQgKAIgMAEQgNAFgPAAQgNAAgLgFgAlXgHQgIACgEAFQgGACAAAJQAAAKAIAFQAHAFALAAQAKAAAKgEQALgEAHgIIAAgUIgNgDIgQgBQgIAAgJACgAH3AyIAAhZIgmA5IgSAAIgmg5IAABZIgdAAIAAiEIAfAAIAtBHIAuhHIAeAAIAACEgAE4AyIAAiEIAeAAIAACEgACoAyIAAiEIAeAAIAAAtIAlAAQASAAAMAGQALAGAHAKQAFAKAAAKQAAANgFALQgHAKgLAGQgMAFgSAAgADGAbIAgAAQANgBAHgFQAIgFAAgLQAAgIgIgFQgHgFgNgBIggAAgAg/AyIgngzIgTAAIAAAzIgeAAIAAgzIgTAAIgnAzIgiAAIAzhBIgthDIAgAAIAlA4IARAAIAAg4IAeAAIAAA4IARAAIAlg4IAgAAIgtBDIAzBBgAmzAyIgsg2IgXAAIAAA2IgeAAIAAiEIAeAAIAAA1IAXAAIAmg1IAjAAIgxBDIA2BBg");
	this.shape.setTransform(53.3,8.7);

	this.timeline.addTween(cjs.Tween.get(this.shape).wait(1));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(0,0,106.6,17.4);


(lib.Символ6 = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// Слой 1
	this.shape = new cjs.Shape();
	this.shape.graphics.f("#FFFFFF").s().p("AgfBjIAAjCIAbAAIAAAVQAFgKAOgHQAMgHASAAQAVAAAPAKQAOAJAJAQQAIAQABATQgBAUgIAOQgJAQgOAKQgPAJgVAAQgRAAgMgGQgMgGgFgJIAABPgAAVhEQgIAEgGAGQgHAHgBAHIAAAhQABAHAHAFQAGAGAIAEQAJAEAKAAQASAAAMgMQAMgKAAgVQAAgTgMgNQgMgMgSAAQgKAAgJAEgAGwBKIAAgkIhsAAIAAAkIgcAAIAAg9IASAAQAMgTAFgbQAFgbgBgjIBpAAIAABsIAUAAIAAA9gAFngXQgFAVgJAPIBCAAIAAhTIgwAAQgBAbgDAUgALrAlQgMgEgLgJQgKgIgGgNQgHgLAAgSQABgTAGgOQAGgNALgJQALgJANgEQANgEANAAQAMAAALACQAKADAJAFIAAAcQgHgGgKgDQgKgDgKAAQgNAAgKAFQgLAEgHAKQgHAKAAAPQAAAQAHAKQAGAHALAFQALAFAMAAQALAAAKgDQAKgDAJgFIAAAcQgLAFgKACQgMACgMAAQgNAAgOgEgAH2AlQgLgFgHgJQgGgJgBgOQABgPAJgKQAIgKAPgEQANgEAPAAIARABIASADIAAgFQgBgMgIgIQgJgIgSAAQgPAAgMADQgNADgJAEIAAgbIAXgGQAMgDARAAQAdAAAQAOQARAOAAAeIAAAvQABAFACACQADADAEgBIAFAAIAEgBIAAAVQgEACgFABIgKABQgJAAgHgEQgHgEgEgIQgJAIgOAFQgMAEgQAAQgMAAgKgEgAIPgUQgJACgFAFQgEAFgBAIQAAAIAIAFQAHAFAKAAQALAAAKgEQAKgEAJgIIAAgUIgPgDIgPgBQgJAAgHACgACqAhQgQgIgLgPQgKgOAAgYQAAgXAKgPQALgQAQgIQAQgIAUAAQATAAARAIQAQAIAKAQQAKAPAAAXQAAAYgKAOQgKAPgQAIQgRAIgTAAQgUAAgQgIgACvg7QgLAMgBATQABAVALAJQALAMAUAAQASAAAMgMQAMgJAAgVQAAgTgMgMQgMgMgSAAQgUAAgLAMgAipAhQgQgIgKgPQgLgOABgYQgBgXALgPQAKgQAQgIQARgIATAAQATAAARAIQAQAIAKAQQALAPAAAXQAAAYgLAOQgKAPgQAIQgRAIgTAAQgTAAgRgIgAijg7QgMAMgBATQABAVAMAJQALAMATAAQATAAALgMQAMgJABgVQgBgTgMgMQgLgMgTAAQgTAAgLAMgAnRAlQgNgEgKgJQgKgIgGgNQgHgLAAgSQABgTAGgOQAGgNALgJQALgJANgEQANgEANAAQAMAAALACQAKADAJAFIAAAcQgIgGgJgDQgKgDgKAAQgMAAgLAFQgLAEgHAKQgHAKAAAPQAAAQAHAKQAGAHALAFQALAFAMAAQALAAAKgDQALgDAHgFIAAAcQgKAFgKACQgMACgMAAQgNAAgOgEgAlxAnIgJgCIAAgYIAEABIAEABQALAAAHgOQAGgMAEgZQACgZABgiIBoAAIAACFIgeAAIAAhrIguAAQgBAhgFAZQgFAXgKAOQgKAOgSAAIgJgBgAo5AmIAAhWIhIBWIgaAAIAAiFIAdAAIAABYIBIhYIAbAAIAACFgArRAmIgsg2IgXAAIAAA2IgeAAIAAiFIAeAAIAAA2IAXAAIAmg2IAjAAIgxBDIA2BCg");
	this.shape.setTransform(81.9,10);

	this.timeline.addTween(cjs.Tween.get(this.shape).wait(1));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(0,0,163.8,20);


(lib.Символ5 = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// Слой 1
	this.shape = new cjs.Shape();
	this.shape.graphics.f("#FFFFFF").s().p("AGcBcQgRgIgLgQQgKgQAAgYQAAgSAGgLQAGgNAKgJQAKgJAMgEQAMgEAMAAQAUAAANAHQAOAHAIAMQAHAMACANQACAOgDAPIhlAAQACAMAHAHQAIAIALADQALAEAMAAQANAAAKgDQALgCAJgFIAAAaQgJAFgNACQgMACgOAAQgVAAgRgHgAGogLQgJADgFAIQgGAGAAALIBKAAQABgGgDgIQgDgGgHgGQgIgGgPAAQgKAAgJAEgAknBbQgQgIgKgPQgLgQAAgYQAAgXALgNQAKgQAQgIQARgIATAAQATAAARAIQAQAIAKAQQAKANABAXQgBAYgKAQQgKAPgQAIQgRAIgTAAQgTAAgRgIgAkigBQgLAKgBATQABAVALALQAMAMATAAQATAAALgMQAMgLAAgVQAAgTgMgKQgLgMgTAAQgTAAgMAMgAiiBhIgKgCIAAgYIAFABIAEABQALAAAGgOQAHgOADgZQADgXABgiIBoAAIAACFIgeAAIAAhrIguAAQgBAfgFAZQgFAZgKAOQgLAOgRAAIgJgBgACZBgIAAiFIAeAAIAABqIAzAAIAAhqIAeAAIAABqIAzAAIAAhqIAdAAIAACFgAAHBgIAAiFIAeAAIAAArIAlAAQARAAAMAGQAMAGAGAKQAGAKAAANQAAANgGAKQgGAKgMAGQgMAGgRAAgAAlBIIAfAAQAOAAAHgFQAIgGAAgKQAAgLgIgFQgHgFgOAAIgfAAgAn6BgIAAjCICLAAIAAAdIhrAAIAAAvIAwAAQAOAAANACQANADALAHQALAGAGAKQAHAMAAASQAAASgHAMQgGALgLAHQgLAHgNACQgNADgOAAgAnaBDIAwAAQALAAAJgCQAKgCAGgHQAGgHAAgNQAAgNgGgHQgGgHgKgCQgJgCgLAAIgwAAg");
	this.shape.setTransform(50.8,10);

	this.timeline.addTween(cjs.Tween.get(this.shape).wait(1));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(0,0,101.5,20);


(lib.Символ4 = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// Слой 1
	this.instance = new lib.pic2_728();

	this.timeline.addTween(cjs.Tween.get(this.instance).wait(1));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(0,0,553,272);


(lib.Символ3 = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// Слой 1
	this.shape = new cjs.Shape();
	this.shape.graphics.f("#FFFFFF").s().p("AioBlIgIgCIAAgaIAHABIAGABQALAAAJgIQAIgHAGgQIADgHIhAiFIAgAAIAtBjIAohjIAfAAIg/CWQgHASgJAKQgIAKgKAFQgJAEgLAAIgJAAgAjlBIIAAgkIhsAAIAAAkIgdAAIAAg9IATAAQAMgTAFgaQAFgcgBgiIBpAAIAABrIAUAAIAAA9gAkvgYQgEAUgJAPIBBAAIAAhTIgvAAQgBAbgEAVgAHWAfQgQgHgKgQQgLgOAAgYQAAgWALgQQAKgQAQgIQARgIATAAQATAAARAIQAQAIAKAQQAKAQABAWQgBAYgKAOQgKAQgQAHQgRAJgTgBQgTABgRgJgAHbg8QgLALgBATQABAVALAKQAMALATAAQATAAALgLQAMgKAAgVQAAgTgMgLQgLgMgTAAQgTAAgMAMgABNAhQgPgGgKgOQgLgNgDgQIgdAAIAAA0IgcAAIAAiEIAcAAIAAA2IAdAAQADgTALgNQAKgNAPgHQAPgGARAAQATAAARAIQAQAIAKAQQALAQAAAWQAAAYgLAOQgKAQgQAHQgRAJgTgBQgRAAgPgGgABOg9QgLAMAAATQAAAVALAKQAMAMATAAQAUAAALgMQALgKABgVQgBgTgLgMQgLgMgUgBQgTABgMAMgArIAjQgLgEgGgKQgHgIAAgNQABgRAJgJQAIgLAOgEQAOgDAOAAIASABIARACIAAgEQAAgNgJgIQgJgIgRAAQgPAAgMADQgNADgJAFIAAgcIAWgGQANgDARAAQAdAAAQAOQARAPAAAdIAAAvQAAAFADACQADADAEgBIAEAAIAFgBIAAAWQgEABgFABIgKABQgKAAgGgEQgHgDgEgJQgKAJgNAEQgMAFgQgBQgMABgLgFgAqvgWQgIADgFAFQgFAEAAAIQAAAJAIAEQAHAFAKABQALAAAKgFQAKgEAIgHIAAgVIgOgDIgPAAQgJgBgIACgAL1AkIAAiEIAeAAIAAAtIAlAAQARgBAMAHQALAFAHAKQAGAKAAANQAAALgGAKQgHAKgLAGQgMAGgRAAgAMTAMIAfAAQANAAAIgFQAHgFAAgJQAAgKgHgGQgIgFgNAAIgfAAgAKxAkIAAgqIgRAEQgJACgLAAQgPAAgMgGQgMgEgGgMQgHgLAAgRIAAguIAeAAIAAAsQAAAPAIAFQAIAGAPAAIAPgBIANgFIAAhAIAeAAIAACEgAF2AkIAAg0IhDAAIAAA0IgeAAIAAiEIAeAAIAAA2IBDAAIAAg2IAeAAIAACEgAmXAkIgogzIgSAAIAAAzIgeAAIAAgzIgTAAIgoAzIghAAIAzhCIguhCIAhAAIAlA3IARAAIAAg3IAeAAIAAA3IARAAIAkg3IAhAAIgtBCIAyBCgAsMAkIgsg2IgWAAIAAA2IgeAAIAAiEIAeAAIAAA1IAXAAIAmg1IAiAAIgwBCIA2BCg");
	this.shape.setTransform(87.7,10.2);

	this.timeline.addTween(cjs.Tween.get(this.shape).wait(1));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(0,0,175.5,20.3);


(lib.Символ2 = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// Слой 1
	this.shape = new cjs.Shape();
	this.shape.graphics.f("#FFFFFF").s().p("AATCCIAAjCIAbAAIAAAVQAIgKANgHQAMgHASgBQAVABAPAJQAPAKAIAQQAIAPABASQgBAUgIAQQgIAQgPAKQgPAJgVAAQgRAAgMgHQgMgFgHgJIAABPgABJglQgIADgGAHQgGAGgEAIIAAAeQAEAIAGAHQAGAGAIAEQAIADALABQATAAALgMQALgNABgUQgBgSgLgMQgLgMgTAAQgLAAgIAEgAIPBEQgLgFgGgJQgHgJAAgOQABgRAJgKQAJgIANgEQAOgEAOAAIASABIASADIAAgFQgBgMgIgJQgKgHgRgBQgPAAgMAEQgNADgIAEIAAgcIAVgFQAOgEAQAAQAdAAAQAPQARAOAAAeIAAAuQAAAGADACQADADAEgBIAFAAIAEgCIAAAWQgEACgFABIgKABQgKAAgGgFQgHgDgEgIQgJAIgNAFQgNAEgPAAQgNAAgLgEgAIpAJQgJACgFAFQgFAFAAAIQABAKAHAFQAHAFALAAQAKAAAKgEQAKgEAJgIIAAgXIgPgCIgPgBQgJAAgHACgADPBEQgLgFgGgJQgHgJAAgOQAAgRAKgKQAIgIAOgEQAOgEAOAAIARABIASADIAAgFQAAgMgJgJQgJgHgSgBQgPAAgMAEQgMADgJAEIAAgcIAWgFQANgEARAAQAdAAAQAPQARAOAAAeIAAAuQAAAGACACQADADAFgBIAEAAIAFgCIAAAWQgFACgEABIgKABQgKAAgGgFQgIgDgDgIQgKAIgNAFQgMAEgQAAQgMAAgLgEgADoAJQgIACgFAFQgFAFgBAIQABAKAHAFQAIAFAKAAQALAAAJgEQALgEAIgIIAAgXIgOgCIgQgBQgIAAgIACgAk1BFQgMgDgKgEIAAgbIANAGIARAEIARABQAJABAJgCQAIgCAFgEQAFgEABgHQgBgHgEgEQgEgDgHgCIgMgBIgcAAIAAgUIAcAAQAKAAAIgEQAGgDAAgJQAAgJgJgEQgIgEgOgBQgMABgNADQgNADgIAEIAAgZQAKgFAMgDQANgCAOgBQAUABANAFQANAFAHAIQAGAKAAALQgBAMgGAHQgHAIgKABQAMADAHAIQAHAIAAANQABASgRALQgQALgfAAQgOAAgOgDgAm+BAQgRgHgKgQQgLgQAAgYQAAgQAGgNQAGgNAKgKQAKgIAMgEQAMgFAMAAQAUAAAOAIQANAHAIAMQAHAMACAOQACAOgDANIhlAAQACANAIAHQAHAIALADQALAEANgBQAMABAKgDQALgDAJgEIAAAaQgJAFgMACQgNACgOAAQgVAAgRgIgAmygmQgJADgFAIQgFAIgBALIBKAAQABgGgCgIQgDgIgIgGQgIgHgPAAQgKAAgJAFgApkA/QgQgJgIgRQgKgSAAgZQAAgiAMgXQALgXASgLQAPgJAMgDIAZgGQALgCAIgCQAJgEAIgGIAAAdQgIAFgHADQgIACgJABIgSAEQgJADgLAGQgMAHgHAMQgGALgDAMQAGgKAMgHQANgGAPAAQASAAAOAHQAOAJAJAOQAIAPAAASQABAWgKAOQgJAPgPAHQgQAIgVAAQgTAAgRgJgApVgZQgKAGgEAJQgEAJAAAIQAAAKAEAJQAFAJAIAGQAJAFANAAQANAAAKgFQAIgGAFgJQAEgJAAgKQAAgJgEgJQgFgJgIgGQgKgFgNAAQgNAAgIAGgAG+BFIAAhqIhDAAIAABqIgeAAIAAiFIB/AAIAACFgAgiBFIgjgwIgjAwIgiAAIA0hFIgyhAIAjAAIAgAuIAgguIAiAAIgxBAIA0BFg");
	this.shape.setTransform(64.8,13.1);

	this.timeline.addTween(cjs.Tween.get(this.shape).wait(1));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(0,0,129.5,26.1);


(lib.Символ1 = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// Слой 1
	this.shape = new cjs.Shape();
	this.shape.graphics.f("#FFFFFF").s().p("AElBdQgRgHgKgQQgLgQAAgYQAAgSAGgMQAGgMAKgKQALgIALgEQAMgFAMAAQAUAAAOAIQAOAHAHAMQAIAMACAMQACAOgEAPIhlAAQACANAIAHQAHAIALADQALAEANgBQAMABALgDQALgDAIgEIAAAaQgJAFgMACQgNACgOAAQgVAAgRgIgAEygJQgJADgGAGQgFAIgBALIBLAAQABgGgDgIQgDgGgIgGQgIgHgOAAQgLAAgIAFgAlBBfQgTgGgPgNQgPgMgIgTQgJgTAAgZQAAgYAJgTQAIgUAPgNQAPgNASgGQATgGATAAQAPAAAOADQAOAEANAGIAAAfQgKgIgNgDQgNgEgOABQgOAAgOADQgOAFgLAJQgLAJgGAOQgHAOAAARQAAASAHANQAGAOAMAJQALAIANAEQAOAFAOAAQAPgBAOgDQANgEAKgIIAAAgQgNAHgOADQgPADgPAAQgUAAgSgGgACkBiIAAhqIguAAIAAgbIB6AAIAAAbIguAAIAABqgABABiIAAhYIhGBYIgaAAIAAiFIAeAAIAABWIBGhWIAaAAIAACFgAhjBiIAAhqIhDAAIAABqIgeAAIAAiFIB/AAIAACFg");
	this.shape.setTransform(38.9,10.2);

	this.timeline.addTween(cjs.Tween.get(this.shape).wait(1));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(0,0,77.8,20.3);


(lib.Анимация2 = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// Слой 1
	this.instance = new lib.pic1_728();
	this.instance.setTransform(-276,-45);

	this.timeline.addTween(cjs.Tween.get(this.instance).wait(1));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(-276,-45,552,90);


(lib.txt2_3 = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// timeline functions:
	this.frame_28 = function() {
		this.stop();
	}

	// actions tween:
	this.timeline.addTween(cjs.Tween.get(this).wait(28).call(this.frame_28).wait(1));

	// Слой 3
	this.instance = new lib.txt5_3();
	this.instance.setTransform(134.4,46,0.687,0.687,0,0,0,25.1,46);
	this.instance.alpha = 0;
	this.instance._off = true;

	this.timeline.addTween(cjs.Tween.get(this.instance).wait(8).to({_off:false},0).to({scaleX:1,scaleY:1,alpha:1},19,cjs.Ease.get(1)).wait(2));

	// Слой 2
	this.instance_1 = new lib.txt4_3();
	this.instance_1.setTransform(134.5,46,0.687,0.687,0,0,0,124.5,46);
	this.instance_1.alpha = 0;
	this.instance_1._off = true;

	this.timeline.addTween(cjs.Tween.get(this.instance_1).wait(4).to({_off:false},0).to({scaleX:1,scaleY:1,x:134.4,alpha:1},19,cjs.Ease.get(1)).wait(6));

	// Слой 1
	this.instance_2 = new lib.txt3_3();
	this.instance_2.setTransform(134.4,25.4,0.687,0.687,0,0,0,134.3,16);
	this.instance_2.alpha = 0;

	this.timeline.addTween(cjs.Tween.get(this.instance_2).to({scaleX:1,scaleY:1,x:134.3,y:16,alpha:1},19,cjs.Ease.get(1)).wait(10));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(31.9,0,204.9,92);


(lib.txt2_2 = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// timeline functions:
	this.frame_31 = function() {
		this.stop();
	}

	// actions tween:
	this.timeline.addTween(cjs.Tween.get(this).wait(31).call(this.frame_31).wait(1));

	// Символ 8
	this.instance = new lib.Символ8();
	this.instance.setTransform(156.2,57.3,0.374,0.374,0,0,0,48.1,8.8);
	this.instance.alpha = 0;
	this.instance._off = true;

	this.timeline.addTween(cjs.Tween.get(this.instance).wait(12).to({_off:false},0).to({regY:8.7,scaleX:1,scaleY:1,x:192.8,y:77.9,alpha:1},19,cjs.Ease.get(1)).wait(1));

	// Символ 7
	this.instance_1 = new lib.Символ7();
	this.instance_1.setTransform(114.5,57.3,0.374,0.374,0,0,0,53.4,8.8);
	this.instance_1.alpha = 0;
	this.instance_1._off = true;

	this.timeline.addTween(cjs.Tween.get(this.instance_1).wait(8).to({_off:false},0).to({regX:53.3,regY:8.7,scaleX:1,scaleY:1,x:81.1,y:77.9,alpha:1},19,cjs.Ease.get(1)).wait(5));

	// Символ 6
	this.instance_2 = new lib.Символ6();
	this.instance_2.setTransform(134.5,46.6,0.374,0.374,0,0,0,81.9,10.1);
	this.instance_2.alpha = 0;
	this.instance_2._off = true;

	this.timeline.addTween(cjs.Tween.get(this.instance_2).wait(4).to({_off:false},0).to({regY:10,scaleX:1,scaleY:1,x:134.7,y:49.2,alpha:1},19,cjs.Ease.get(1)).wait(9));

	// Символ 5
	this.instance_3 = new lib.Символ5();
	this.instance_3.setTransform(134.6,33.2,0.374,0.374,0,0,0,50.9,10.1);
	this.instance_3.alpha = 0;

	this.timeline.addTween(cjs.Tween.get(this.instance_3).to({regX:50.8,regY:10,scaleX:1,scaleY:1,x:135.1,y:13.4,alpha:1},19,cjs.Ease.get(1)).wait(13));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(20.6,0,227.5,92);


(lib.txt2 = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// timeline functions:
	this.frame_28 = function() {
		this.stop();
	}

	// actions tween:
	this.timeline.addTween(cjs.Tween.get(this).wait(28).call(this.frame_28).wait(1));

	// Символ 3
	this.instance = new lib.Символ3();
	this.instance.setTransform(135,65.4,0.577,0.577,0,0,0,87.8,10.2);
	this.instance.alpha = 0;
	this.instance._off = true;

	this.timeline.addTween(cjs.Tween.get(this.instance).wait(8).to({_off:false},0).to({regX:87.7,scaleX:1,scaleY:1,x:134.9,y:79.4,alpha:1},19,cjs.Ease.get(1)).wait(2));

	// Символ 2
	this.instance_1 = new lib.Символ2();
	this.instance_1.setTransform(134.9,46.2,0.577,0.577,0,0,0,64.8,13.1);
	this.instance_1.alpha = 0;
	this.instance_1._off = true;

	this.timeline.addTween(cjs.Tween.get(this.instance_1).wait(4).to({_off:false},0).to({scaleX:1,scaleY:1,x:134.8,alpha:1},19,cjs.Ease.get(1)).wait(6));

	// Символ 1
	this.instance_2 = new lib.Символ1();
	this.instance_2.setTransform(134.7,27.3,0.577,0.577,0,0,0,38.9,10.2);
	this.instance_2.alpha = 0;

	this.timeline.addTween(cjs.Tween.get(this.instance_2).to({scaleX:1,scaleY:1,x:134.5,y:13.3,alpha:1},19,cjs.Ease.get(1)).wait(10));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(43.3,0,182.2,92);


(lib.txt1 = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// timeline functions:
	this.frame_20 = function() {
		this.stop();
	}

	// actions tween:
	this.timeline.addTween(cjs.Tween.get(this).wait(20).call(this.frame_20).wait(1));

	// whirl
	this.instance = new lib.whirl();
	this.instance.setTransform(119.6,101.6,1.464,1.464,0,0,0,43.3,13.2);
	this.instance.alpha = 0;
	this.instance._off = true;

	this.timeline.addTween(cjs.Tween.get(this.instance).wait(6).to({_off:false},0).to({scaleX:1,scaleY:1,y:84.2,alpha:1},14,cjs.Ease.get(1)).wait(1));

	// booster
	this.instance_1 = new lib.booster();
	this.instance_1.setTransform(119.6,46.9,1.464,1.464,0,0,0,64.7,12.8);
	this.instance_1.alpha = 0;
	this.instance_1._off = true;

	this.timeline.addTween(cjs.Tween.get(this.instance_1).wait(3).to({_off:false},0).to({scaleX:1,scaleY:1,alpha:1},14,cjs.Ease.get(1)).wait(4));

	// nasal
	this.instance_2 = new lib.nasal();
	this.instance_2.setTransform(119.5,-7.7,1.464,1.464,0,0,0,43.7,13.3);
	this.instance_2.alpha = 0;

	this.timeline.addTween(cjs.Tween.get(this.instance_2).to({regY:13.4,scaleX:1,scaleY:1,y:9.6,alpha:1},14,cjs.Ease.get(1)).wait(7));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(54.9,-27.2,129.3,129.2);


(lib.pro = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// Слой 5
	this.instance = new lib.product2();
	this.instance.setTransform(150.1,276.2,0.761,0.761,-8.9,0,0,143.9,91.2);
	this.instance.alpha = 0;

	this.timeline.addTween(cjs.Tween.get(this.instance).to({regY:91,scaleX:0.91,scaleY:0.91,rotation:-4.3,y:276,alpha:0.801},15,cjs.Ease.get(0.8)).to({regX:144,scaleX:1,scaleY:1,rotation:0,x:150,alpha:1},65,cjs.Ease.get(1)).wait(134));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(6,185,288,182);


(lib.btn3 = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// Слой 4 (mask)
	var mask = new cjs.Shape();
	mask._off = true;
	var mask_graphics_24 = new cjs.Graphics().p("ApoFwQhjgBAAhjIAAoXQAAhjBjgBITQAAQBlABgBBjIAAIXQABBjhlABg");

	this.timeline.addTween(cjs.Tween.get(mask).to({graphics:null,x:0,y:0}).wait(24).to({graphics:mask_graphics_24,x:134.7,y:21.6}).wait(67));

	// Слой 5
	this.instance = new lib.white();
	this.instance.setTransform(-82.8,27.1,1,1,45,0,0,30.5,130.4);
	this.instance.alpha = 0.5;
	this.instance._off = true;

	this.instance.mask = mask;

	this.timeline.addTween(cjs.Tween.get(this.instance).wait(24).to({_off:false},0).to({x:347.2},20,cjs.Ease.get(1)).wait(47));

	// Слой 3
	this.shape = new cjs.Shape();
	this.shape.graphics.f("#633D0C").s().p("AAWA+IAAgoIgLAAIgcAoIgmAAIAigtQgLgEgIgJQgGgHgBgPQABgQAGgKQAIgJALgEQAMgFALAAIA2AAIAAB8gAgIgdQgFADAAAIQAAAHAFAEQAFADAGABIATAAIAAgdIgTAAQgGgBgFAEg");
	this.shape.setTransform(179,41.8);

	this.shape_1 = new cjs.Shape();
	this.shape_1.graphics.f("#633D0C").s().p("AAXA+IAAgzIAAgKIAAgJIgvBGIgfAAIAAh8IAhAAIAAA0IAAAKIgBAJIAwhHIAfAAIAAB8g");
	this.shape_1.setTransform(165.9,41.8);

	this.shape_2 = new cjs.Shape();
	this.shape_2.graphics.f("#633D0C").s().p("AAXA+IAAgwIgtAAIAAAwIghAAIAAh8IAhAAIAAAxIAtAAIAAgxIAhAAIAAB8g");
	this.shape_2.setTransform(151.7,41.8);

	this.shape_3 = new cjs.Shape();
	this.shape_3.graphics.f("#633D0C").s().p("AAhA+IgHgUIgyAAIgIAUIgiAAIAyh8IAiAAIAxB8gAAQAPIgNgiIgCgEIgBgIIAAAIIgCAEIgNAiIAfAAg");
	this.shape_3.setTransform(137.5,41.8);

	this.shape_4 = new cjs.Shape();
	this.shape_4.graphics.f("#633D0C").s().p("AAZA+IgZgqIgYAqIgnAAIArg/Igpg9IAoAAIAVAmIAXgmIAmAAIgoA9IArA/g");
	this.shape_4.setTransform(124.1,41.8);

	this.shape_5 = new cjs.Shape();
	this.shape_5.graphics.f("#633D0C").s().p("AAnA+IAAh8IAhAAIAAB8gAhHA+IAAh8IAgAAIAAAoIARAAQAQAAAKAEQANAEAHAKQAHAHAAARQAAAQgHAJQgHAKgNAEQgKADgQAAgAgnAhIATAAQAFABAFgCQAEgBACgDQADgDAAgFQAAgHgDgCQgCgEgEgBIgKgBIgTAAg");
	this.shape_5.setTransform(108.8,41.8);

	this.shape_6 = new cjs.Shape();
	this.shape_6.graphics.f("#633D0C").s().p("AApBLIAAgaIhRAAIAAAaIgcAAIAAg3IANAAQAJgNAEgPQAFgQABgRQACgRAAgRIBYAAIAABfIAPAAIAAA3gAgJgIQgDAPgHANIAnAAIAAhBIgYAAQgBATgEASg");
	this.shape_6.setTransform(92.3,43.1);

	this.shape_7 = new cjs.Shape();
	this.shape_7.graphics.f("#633D0C").s().p("AAnA+IAAh8IAiAAIAAB8gAhIA+IAAh8IAhAAIAAAoIARAAQAQAAAKAEQAMAEAIAKQAHAHAAAQQAAARgHAJQgIAJgMAFQgKADgQAAgAgnAhIATAAQAFABAEgBQAFgCACgDQADgDAAgGQAAgFgDgEQgCgCgFgCIgJgBIgTAAg");
	this.shape_7.setTransform(168.8,21.8);

	this.shape_8 = new cjs.Shape();
	this.shape_8.graphics.f("#633D0C").s().p("AAXA+IAAgvIgtAAIAAAvIghAAIAAh8IAhAAIAAAxIAtAAIAAgxIAhAAIAAB8g");
	this.shape_8.setTransform(153,21.8);

	this.shape_9 = new cjs.Shape();
	this.shape_9.graphics.f("#633D0C").s().p("AAhA+IgHgTIgzAAIgGATIgjAAIAxh8IAiAAIAyB8gAAQAPIgNgiIgCgFIgBgHIAAAHIgBAFIgOAiIAfAAg");
	this.shape_9.setTransform(138.8,21.8);

	this.shape_10 = new cjs.Shape();
	this.shape_10.graphics.f("#633D0C").s().p("AgsA+IAAh8IBZAAIAAAeIg4AAIAABeg");
	this.shape_10.setTransform(126.8,21.8);

	this.shape_11 = new cjs.Shape();
	this.shape_11.graphics.f("#633D0C").s().p("AgzA+IAAh8IAyAAQAOAAAMAFQAMADAIAKQAHAJAAAQQAAARgHAIQgIAJgMAEQgMAEgOAAIgRAAIAAAngAgSgEIASAAIAIgBQAEgCADgDQADgDAAgGQAAgFgDgDQgDgDgEgBIgIgCIgSAAg");
	this.shape_11.setTransform(114.9,21.8);

	this.shape_12 = new cjs.Shape();
	this.shape_12.graphics.f("#633D0C").s().p("AgcA8QgNgFgIgKQgJgIgDgNQgFgLAAgNQAAgMAFgMQADgLAJgKQAIgJANgFQANgFAPAAQAQAAANAFQAMAFAJAJQAJAKAEALQAEAMAAAMQAAANgEALQgEANgJAIQgJAKgMAFQgNAFgQAAQgPAAgNgFgAgQgdQgIAFgEAHQgDAIgBAJQABAKADAHQAEAJAIAEQAGAEAKAAQALAAAHgEQAHgEAEgJQAEgHAAgKQAAgJgEgIQgEgHgHgFQgHgFgLAAQgKAAgGAFg");
	this.shape_12.setTransform(100.7,21.8);

	this.shape_13 = new cjs.Shape();
	this.shape_13.graphics.f("#633D0C").s().p("AgzA+IAAh8IAhAAIAAAoIARAAQAOAAAMAEQAMAEAIAJQAHAIAAAQQAAARgHAJQgIAJgMAFQgMADgOAAgAgSAiIASAAQAEAAAEgBQAEgCADgDQADgDAAgGQAAgGgDgDQgDgDgEgBIgIgBIgSAAg");
	this.shape_13.setTransform(184.4,1.8);

	this.shape_14 = new cjs.Shape();
	this.shape_14.graphics.f("#633D0C").s().p("AgPA+IAAheIgkAAIAAgeIBnAAIAAAeIgkAAIAABeg");
	this.shape_14.setTransform(172,1.8);

	this.shape_15 = new cjs.Shape();
	this.shape_15.graphics.f("#633D0C").s().p("AAXA+IAAgzIAAgLIABgIIgwBGIgfAAIAAh8IAhAAIAAA0IAAAKIgBAJIAwhHIAfAAIAAB8g");
	this.shape_15.setTransform(159.2,1.8);

	this.shape_16 = new cjs.Shape();
	this.shape_16.graphics.f("#633D0C").s().p("AgPA+IAAheIgjAAIAAgeIBlAAIAAAeIgiAAIAABeg");
	this.shape_16.setTransform(146.4,1.8);

	this.shape_17 = new cjs.Shape();
	this.shape_17.graphics.f("#633D0C").s().p("AAXA+IAAgzIAAgLIAAgIIguBGIggAAIAAh8IAhAAIAAA0IAAAKIAAAJIAvhHIAfAAIAAB8g");
	this.shape_17.setTransform(133.6,1.8);

	this.shape_18 = new cjs.Shape();
	this.shape_18.graphics.f("#633D0C").s().p("AA9BMIAAgbIiWAAIAAh8IAhAAIAABfIAhAAIAAhfIAfAAIAABfIAhAAIAAhfIAhAAIAABfIAQAAIAAA4g");
	this.shape_18.setTransform(116.7,3.1);

	this.shape_19 = new cjs.Shape();
	this.shape_19.graphics.f("#633D0C").s().p("AAhA+IgHgTIgyAAIgIATIgiAAIAyh8IAiAAIAxB8gAAQAQIgNgiIgBgGIgCgIIAAAIIgCAGIgMAiIAeAAg");
	this.shape_19.setTransform(99.2,1.8);

	this.shape_20 = new cjs.Shape();
	this.shape_20.graphics.f("#633D0C").s().p("AgXA/QgMgCgOgEIAAgfQANAGAMACQALACAJAAIAJgBQAFgCAEgDQACgDAAgEQABgGgFgCQgEgDgIAAIgcAAIAAgbIAcAAQAEAAAEgCQADgCABgFQAAgFgGgDQgEgDgJAAQgIAAgJACQgKADgNAFIAAgfQAMgEALgCQAKgCAKAAQANAAAMADQALAEAHAIQAGAIAAAMQAAAJgFAHQgGAHgJAEQAHABAGADQAFAEAEAGQADAHAAAJQAAALgFAHQgEAHgIAEQgIAFgJABIgRACIgEAAQgJAAgJgCg");
	this.shape_20.setTransform(86.4,1.8);

	this.timeline.addTween(cjs.Tween.get({}).to({state:[{t:this.shape_20},{t:this.shape_19},{t:this.shape_18},{t:this.shape_17},{t:this.shape_16},{t:this.shape_15},{t:this.shape_14},{t:this.shape_13},{t:this.shape_12},{t:this.shape_11},{t:this.shape_10},{t:this.shape_9},{t:this.shape_8},{t:this.shape_7},{t:this.shape_6},{t:this.shape_5},{t:this.shape_4},{t:this.shape_3},{t:this.shape_2},{t:this.shape_1},{t:this.shape}]}).wait(91));

	// Слой 1
	this.shape_21 = new cjs.Shape();
	this.shape_21.graphics.f("#FEC006").s().p("ApoFwQhjgBAAhjIAAoXQAAhjBjgBITQAAQBlABgBBjIAAIXQABBjhlABg");
	this.shape_21.setTransform(134.7,21.6);

	this.timeline.addTween(cjs.Tween.get(this.shape_21).wait(91));

	// Слой 2
	this.shape_22 = new cjs.Shape();
	this.shape_22.graphics.f("#CE7E0C").s().p("ApmEkQhkAAAAhlIAAl9QAAhlBkABITNAAQBkgBAABlIAAF9QAABlhkAAg");
	this.shape_22.setTransform(134.9,35.2);

	this.timeline.addTween(cjs.Tween.get(this.shape_22).wait(91));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(63,-15.2,143.4,79.6);


(lib.btn2 = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// Слой 4 (mask)
	var mask = new cjs.Shape();
	mask._off = true;
	var mask_graphics_24 = new cjs.Graphics().p("At/FUQhjgBgBhjIAAnfQABhkBjAAIb+AAQBlAAgBBkIAAHfQABBjhlABg");

	this.timeline.addTween(cjs.Tween.get(mask).to({graphics:null,x:0,y:0}).wait(24).to({graphics:mask_graphics_24,x:135.6,y:24.4}).wait(67));

	// Слой 5
	this.instance = new lib.white();
	this.instance.setTransform(-82.8,27.1,1,1,45,0,0,30.5,130.4);
	this.instance.alpha = 0.5;
	this.instance._off = true;

	this.instance.mask = mask;

	this.timeline.addTween(cjs.Tween.get(this.instance).wait(24).to({_off:false},0).to({x:347.2},20,cjs.Ease.get(1)).wait(47));

	// Слой 3
	this.shape = new cjs.Shape();
	this.shape.graphics.f("#633D0C").s().p("AAVA/IgdgxIgQAAIAAAxIghAAIAAh8IAhAAIAAAvIAQAAIAbgvIAlAAIgoA9IAqA/g");
	this.shape.setTransform(195.8,44);

	this.shape_1 = new cjs.Shape();
	this.shape_1.graphics.f("#633D0C").s().p("AgcA8QgMgFgJgKQgIgJgEgLQgFgMAAgNQAAgMAFgMQAEgMAIgIQAJgKAMgFQAMgFAQAAQAQAAANAFQAMAFAJAKQAIAIAFAMQAEAMAAAMQAAANgEAMQgFALgIAJQgJAKgMAFQgNAFgQAAQgQAAgMgFgAgQgdQgIAEgEAJQgDAHAAAJQAAAKADAIQAEAHAIAFQAGAEAKABQAKgBAIgEQAIgFADgHQAEgIAAgKQAAgJgEgHQgDgJgIgEQgIgEgKgBQgKABgGAEg");
	this.shape_1.setTransform(181,44);

	this.shape_2 = new cjs.Shape();
	this.shape_2.graphics.f("#633D0C").s().p("AgzA/IAAh8IA2AAQAVgBALAJQAMAHABAQQAAALgGAGQgFAIgIACQAKADAHAHQAGAHAAANQABAKgFAIQgFAGgHAEQgIAEgJACIgSACgAgTAlIAVAAQAIgBAEgCQAFgEAAgGQAAgIgFgDQgEgDgIAAIgVAAgAgTgMIATAAQAHAAAEgDQADgDAAgGQAAgFgDgEQgEgCgHAAIgTAAg");
	this.shape_2.setTransform(167.4,44);

	this.shape_3 = new cjs.Shape();
	this.shape_3.graphics.f("#633D0C").s().p("AgcA8QgMgFgJgKQgIgJgEgLQgFgMAAgNQAAgMAFgMQAEgMAIgIQAJgKAMgFQAMgFAQAAQAQAAANAFQAMAFAJAKQAIAIAFAMQAEAMAAAMQAAANgEAMQgFALgIAJQgJAKgMAFQgNAFgQAAQgQAAgMgFgAgQgdQgIAEgEAJQgDAHAAAJQAAAKADAIQAEAHAIAFQAGAEAKABQAKgBAIgEQAIgFADgHQAEgIAAgKQAAgJgEgHQgDgJgIgEQgIgEgKgBQgKABgGAEg");
	this.shape_3.setTransform(153.1,44);

	this.shape_4 = new cjs.Shape();
	this.shape_4.graphics.f("#633D0C").s().p("AgzA/IAAh8IAyAAQAOAAAMADQAMAFAIAJQAHAJAAARQAAAQgHAIQgIAJgMAEQgMAEgOAAIgRAAIAAAogAgSgEIASAAIAIgBQAEgBADgDQADgEAAgFQAAgGgDgDQgDgDgEgCIgIgBIgSAAg");
	this.shape_4.setTransform(139.6,44);

	this.shape_5 = new cjs.Shape();
	this.shape_5.graphics.f("#633D0C").s().p("AAXA/IAAg0IAAgLIABgHIgvBGIggAAIAAh8IAhAAIAAAzIAAAKIAAAJIAvhGIAfAAIAAB8g");
	this.shape_5.setTransform(125.9,44);

	this.shape_6 = new cjs.Shape();
	this.shape_6.graphics.f("#633D0C").s().p("AAXA/IAAgwIgtAAIAAAwIghAAIAAh8IAhAAIAAAvIAtAAIAAgvIAhAAIAAB8g");
	this.shape_6.setTransform(111.7,44);

	this.shape_7 = new cjs.Shape();
	this.shape_7.graphics.f("#633D0C").s().p("AgsA/IAAh8IBYAAIAAAcIg3AAIAAATIAyAAIAAAbIgyAAIAAAVIA4AAIAAAdg");
	this.shape_7.setTransform(99,44);

	this.shape_8 = new cjs.Shape();
	this.shape_8.graphics.f("#633D0C").s().p("AgzA/IAAh8IAyAAQAOAAAMADQAMAFAIAJQAHAJAAARQAAAQgHAIQgIAJgMAEQgMAEgOAAIgRAAIAAAogAgSgEIASAAIAIgBQAEgBADgDQADgEAAgFQAAgGgDgDQgDgDgEgCIgIgBIgSAAg");
	this.shape_8.setTransform(87.1,44);

	this.shape_9 = new cjs.Shape();
	this.shape_9.graphics.f("#633D0C").s().p("AgPA/IAAhfIgkAAIAAgdIBnAAIAAAdIgjAAIAABfg");
	this.shape_9.setTransform(74.7,44);

	this.shape_10 = new cjs.Shape();
	this.shape_10.graphics.f("#633D0C").s().p("AgzA/IAAh8IAhAAIAAAnIARAAQAOAAAMAEQAMAEAIAJQAHAIAAARQAAAQgHAJQgIAKgMADQgMAFgOAAgAgSAhIASAAQAEABAEgCQAEgBADgDQADgDAAgFQAAgHgDgCQgDgDgEgCIgIgBIgSAAg");
	this.shape_10.setTransform(216.4,24);

	this.shape_11 = new cjs.Shape();
	this.shape_11.graphics.f("#633D0C").s().p("AgPA/IAAhfIgkAAIAAgdIBmAAIAAAdIgjAAIAABfg");
	this.shape_11.setTransform(204.1,24);

	this.shape_12 = new cjs.Shape();
	this.shape_12.graphics.f("#633D0C").s().p("AgIA+QgMgEgKgIQgKgHgGgNQgFgMAAgQQAAgQAFgNQAGgNAKgIQAKgIAMgEQAKgEANAAQAJAAAKACQAJACAIAEIAAAfQgGgEgIgDQgIgDgJAAQgKAAgJAEQgHAEgFAIQgGAJAAAMQAAAMAGAHQAFAIAHAEQAJADAKAAQAKAAAIgDQAJgDAFgFIAAAhQgIADgJACQgKACgKAAQgNAAgKgDg");
	this.shape_12.setTransform(192.2,24);

	this.shape_13 = new cjs.Shape();
	this.shape_13.graphics.f("#633D0C").s().p("AgcA8QgMgGgJgIQgIgKgFgMQgEgLAAgNQAAgMAEgLQAFgNAIgIQAJgJAMgGQAMgFAQAAQARAAAMAFQANAGAIAJQAJAIAEANQAEALAAAMQAAANgEALQgEAMgJAKQgIAIgNAGQgMAFgRAAQgQAAgMgFgAgRgdQgHAEgEAJQgEAHABAJQgBAJAEAJQAEAHAHAFQAIAFAJAAQAKAAAIgFQAHgFAEgHQAEgJAAgJQAAgJgEgHQgEgJgHgEQgIgFgKABQgJgBgIAFg");
	this.shape_13.setTransform(178.5,24);

	this.shape_14 = new cjs.Shape();
	this.shape_14.graphics.f("#633D0C").s().p("AAXA/IAAgxIgtAAIAAAxIghAAIAAh8IAhAAIAAAvIAtAAIAAgvIAhAAIAAB8g");
	this.shape_14.setTransform(163.9,24);

	this.shape_15 = new cjs.Shape();
	this.shape_15.graphics.f("#633D0C").s().p("AgzA/IAAh8IA2AAQAVAAALAIQAMAHABAQQAAALgGAGQgFAIgIACQAKADAHAGQAGAIAAANQABAKgFAIQgFAHgHAEQgIADgJACIgSACgAgTAlIAVAAQAIAAAEgEQAFgCAAgIQAAgHgFgDQgEgDgIAAIgVAAgAgTgMIATAAQAHAAAEgDQADgDAAgFQAAgGgDgDQgEgDgHAAIgTAAg");
	this.shape_15.setTransform(150.7,24);

	this.shape_16 = new cjs.Shape();
	this.shape_16.graphics.f("#633D0C").s().p("AAXA/IAAg0IAAgKIAAgIIguBGIggAAIAAh8IAhAAIAAAzIAAAKIAAAJIAvhGIAfAAIAAB8g");
	this.shape_16.setTransform(136.9,24);

	this.shape_17 = new cjs.Shape();
	this.shape_17.graphics.f("#633D0C").s().p("AgPA/IAAhfIgjAAIAAgdIBlAAIAAAdIgjAAIAABfg");
	this.shape_17.setTransform(124.1,24);

	this.shape_18 = new cjs.Shape();
	this.shape_18.graphics.f("#633D0C").s().p("AAVA/IgdgxIgQAAIAAAxIghAAIAAh8IAhAAIAAAvIAQAAIAbgvIAlAAIgoA9IAqA/g");
	this.shape_18.setTransform(112.4,24);

	this.shape_19 = new cjs.Shape();
	this.shape_19.graphics.f("#633D0C").s().p("AgsA/IAAh8IBYAAIAAAdIg3AAIAAASIAyAAIAAAbIgyAAIAAAUIA4AAIAAAeg");
	this.shape_19.setTransform(99.6,24);

	this.shape_20 = new cjs.Shape();
	this.shape_20.graphics.f("#633D0C").s().p("AgOBFIAAgPQgSgBgOgGQgOgIgHgLQgIgMAAgQQAAgPAIgMQAHgMAOgHQAOgGASgBIAAgPIAeAAIAAAPQATABANAGQANAIAIAMQAHALAAAPQAAAQgHAMQgIAMgNAGQgNAHgTABIAAAPgAAQAbQAKgCAHgEQAFgEADgGQACgFAAgGQAAgFgCgGQgDgFgFgFQgHgEgKgBgAgfgVQgGAFgCAFQgDAGABAFQgBAGADAFQACAGAGAEQAGAFALABIAAg1QgLABgGAEg");
	this.shape_20.setTransform(85.4,24);

	this.shape_21 = new cjs.Shape();
	this.shape_21.graphics.f("#633D0C").s().p("AgOBFIAAgPQgSgBgOgGQgOgIgIgLQgHgMAAgQQAAgPAHgMQAIgMAOgHQAOgGASgBIAAgPIAeAAIAAAPQASABANAGQAOAIAIAMQAHALAAAPQAAAQgHAMQgIAMgOAGQgNAHgSABIAAAPgAAQAbQAKgCAHgEQAGgEACgGQACgFAAgGQAAgFgCgGQgCgFgGgFQgHgEgKgBgAgfgVQgGAFgCAFQgDAGAAAFQAAAGADAFQACAGAGAEQAGAFALABIAAg1QgLABgGAEg");
	this.shape_21.setTransform(69,24);

	this.shape_22 = new cjs.Shape();
	this.shape_22.graphics.f("#633D0C").s().p("AgiA/QgIgCgJgDIAAghQAGAGAIACQAJADAIAAQAJAAAJgCQAGgCAGgFQAGgEACgJIgyAAIAAgaIAyAAQgDgJgGgFQgFgFgGgBQgIgCgJAAQgJAAgIACQgJACgGAFIAAgfQAJgEAJgCQAJgCAKAAQANAAAKAEQAMAEAKAIQAJAIAGANQAGANAAAQQAAAQgGAMQgGANgJAHQgLAIgMAEQgKADgNAAQgKAAgJgCg");
	this.shape_22.setTransform(54.7,24);

	this.shape_23 = new cjs.Shape();
	this.shape_23.graphics.f("#633D0C").s().p("AgzA+IAAh8IAhAAIAAAoIARAAQAOAAAMAEQAMAEAIAKQAHAHAAARQAAAQgHAJQgIAKgMADQgMAEgOAAgAgSAhIASAAQAEABAEgCQAEgBADgDQADgDAAgFQAAgHgDgCQgDgEgEgBIgIgBIgSAAg");
	this.shape_23.setTransform(184.5,4);

	this.shape_24 = new cjs.Shape();
	this.shape_24.graphics.f("#633D0C").s().p("AgPA+IAAheIgkAAIAAgeIBnAAIAAAeIgkAAIAABeg");
	this.shape_24.setTransform(172.1,4);

	this.shape_25 = new cjs.Shape();
	this.shape_25.graphics.f("#633D0C").s().p("AAXA+IAAgzIAAgKIABgJIgwBGIgfAAIAAh8IAhAAIAAA0IAAAKIgBAJIAwhHIAfAAIAAB8g");
	this.shape_25.setTransform(159.3,4);

	this.shape_26 = new cjs.Shape();
	this.shape_26.graphics.f("#633D0C").s().p("AgIA+QgMgEgKgIQgKgHgGgNQgFgMAAgQQAAgQAFgNQAGgNAKgIQAKgIAMgEQAKgEANAAQAJAAAKACQAJACAIAEIAAAfQgGgEgIgDQgIgDgJAAQgKAAgJAEQgHAEgFAIQgGAJAAAMQAAAMAGAHQAFAIAHAEQAJADAKAAQAKAAAIgDQAJgDAFgFIAAAhQgIADgJACQgKACgKAAQgNAAgKgDg");
	this.shape_26.setTransform(146,4);

	this.shape_27 = new cjs.Shape();
	this.shape_27.graphics.f("#633D0C").s().p("AAnA+IAAh8IAhAAIAAB8gAhIA+IAAh8IAiAAIAAAoIAQAAQAQAAALAEQAMAEAHAKQAHAHAAARQAAAQgHAJQgHAKgMADQgLAEgQAAgAgmAhIASAAQAFABAFgCQADgBADgDQADgDAAgFQAAgHgDgCQgDgEgDgBIgKgBIgSAAg");
	this.shape_27.setTransform(131.2,4);

	this.shape_28 = new cjs.Shape();
	this.shape_28.graphics.f("#633D0C").s().p("AgzA+IAAh8IA2AAQAVABAMAHQALAIAAAQQAAAKgEAIQgGAGgIADQAKADAHAGQAGAIABANQAAALgFAGQgFAHgHAFQgIAEgJABIgSABgAgSAlIAUAAQAIgBAEgDQAFgCAAgIQAAgHgFgDQgEgDgIAAIgUAAgAgSgMIASAAQAHAAADgDQAEgDAAgFQAAgGgEgDQgDgEgHAAIgSAAg");
	this.shape_28.setTransform(116.4,4);

	this.shape_29 = new cjs.Shape();
	this.shape_29.graphics.f("#633D0C").s().p("AgcA8QgNgGgIgIQgJgKgDgMQgFgLAAgNQAAgMAFgLQADgMAJgKQAIgIANgGQANgFAPAAQAQAAANAFQAMAGAJAIQAJAKAEAMQAEALAAAMQAAANgEALQgEAMgJAKQgJAIgMAGQgNAFgQAAQgPAAgNgFgAgQgdQgIAFgEAHQgDAJgBAIQABAKADAHQAEAJAIAEQAGAFAKgBQALABAHgFQAHgEAEgJQAEgHAAgKQAAgIgEgJQgEgHgHgFQgHgFgLABQgKgBgGAFg");
	this.shape_29.setTransform(102.1,4);

	this.shape_30 = new cjs.Shape();
	this.shape_30.graphics.f("#633D0C").s().p("AAXA+IAAheIgtAAIAABeIghAAIAAh8IBvAAIAAB8g");
	this.shape_30.setTransform(87.4,4);

	this.timeline.addTween(cjs.Tween.get({}).to({state:[{t:this.shape_30},{t:this.shape_29},{t:this.shape_28},{t:this.shape_27},{t:this.shape_26},{t:this.shape_25},{t:this.shape_24},{t:this.shape_23},{t:this.shape_22},{t:this.shape_21},{t:this.shape_20},{t:this.shape_19},{t:this.shape_18},{t:this.shape_17},{t:this.shape_16},{t:this.shape_15},{t:this.shape_14},{t:this.shape_13},{t:this.shape_12},{t:this.shape_11},{t:this.shape_10},{t:this.shape_9},{t:this.shape_8},{t:this.shape_7},{t:this.shape_6},{t:this.shape_5},{t:this.shape_4},{t:this.shape_3},{t:this.shape_2},{t:this.shape_1},{t:this.shape}]}).wait(91));

	// Слой 1
	this.shape_31 = new cjs.Shape();
	this.shape_31.graphics.f("#FEC006").s().p("At/FUQhjgBgBhjIAAnfQABhkBjAAIb+AAQBlAAgBBkIAAHfQABBjhlABg");
	this.shape_31.setTransform(135.6,24.4);

	this.timeline.addTween(cjs.Tween.get(this.shape_31).wait(91));

	// Слой 2
	this.shape_32 = new cjs.Shape();
	this.shape_32.graphics.f("#CE7E0C").s().p("At/EkQhjAAgBhlIAAl9QABhlBjABIb+AAQBlgBgBBlIAAF9QABBlhlAAg");
	this.shape_32.setTransform(135.6,35.2);

	this.timeline.addTween(cjs.Tween.get(this.shape_32).wait(91));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(36,-9.6,199.2,74);


(lib.btn1 = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// Слой 4 (mask)
	var mask = new cjs.Shape();
	mask._off = true;
	var mask_graphics_24 = new cjs.Graphics().p("AqOEkQhlgBABhjIAAl/QgBhjBlgBIUeAAQBkABAABjIAAF/QAABjhkABg");

	this.timeline.addTween(cjs.Tween.get(mask).to({graphics:null,x:0,y:0}).wait(24).to({graphics:mask_graphics_24,x:135.6,y:29.2}).wait(67));

	// Слой 5
	this.instance = new lib.white();
	this.instance.setTransform(-82.8,27.1,1,1,45,0,0,30.5,130.4);
	this.instance.alpha = 0.5;
	this.instance._off = true;

	this.instance.mask = mask;

	this.timeline.addTween(cjs.Tween.get(this.instance).wait(24).to({_off:false},0).to({x:347.2},20,cjs.Ease.get(1)).wait(47));

	// Слой 3
	this.shape = new cjs.Shape();
	this.shape.graphics.f("#633D0C").s().p("AAhA/IgHgVIgyAAIgIAVIgiAAIAyh8IAiAAIAxB8gAAQAPIgNgiIgCgEIgBgJIAAAJIgCAEIgNAiIAfAAg");
	this.shape.setTransform(177.6,38.4);

	this.shape_1 = new cjs.Shape();
	this.shape_1.graphics.f("#633D0C").s().p("AAXA/IAAhfIgtAAIAABfIghAAIAAh8IBvAAIAAB8g");
	this.shape_1.setTransform(163.5,38.4);

	this.shape_2 = new cjs.Shape();
	this.shape_2.graphics.f("#633D0C").s().p("AAhA/IgHgVIgzAAIgHAVIgiAAIAyh8IAiAAIAxB8gAAQAPIgNgiIgCgEIgBgJIAAAJIgBAEIgOAiIAfAAg");
	this.shape_2.setTransform(149.3,38.4);

	this.shape_3 = new cjs.Shape();
	this.shape_3.graphics.f("#633D0C").s().p("AgzA/IAAh8IAyAAQAOAAAMADQAMAEAIAKQAHAKAAAPQAAARgHAHQgIAKgMAEQgMAEgOAAIgRAAIAAAogAgSgEIASAAIAIgBQAEgBADgEQADgCAAgHQAAgFgDgDQgDgDgEgCIgIAAIgSAAg");
	this.shape_3.setTransform(136.4,38.4);

	this.shape_4 = new cjs.Shape();
	this.shape_4.graphics.f("#633D0C").s().p("AAZA/IgZgrIgYArIgnAAIArhAIgpg8IAnAAIAWAlIAXglIAmAAIgpA8IAsBAg");
	this.shape_4.setTransform(123.3,38.4);

	this.shape_5 = new cjs.Shape();
	this.shape_5.graphics.f("#633D0C").s().p("AgPA/IAAhfIgkAAIAAgdIBmAAIAAAdIgjAAIAABfg");
	this.shape_5.setTransform(106.9,38.4);

	this.shape_6 = new cjs.Shape();
	this.shape_6.graphics.f("#633D0C").s().p("AgcA8QgMgGgJgIQgJgKgEgMQgEgLAAgNQAAgMAEgLQAEgNAJgIQAJgJAMgGQANgFAPAAQAQAAANAFQAMAGAJAJQAIAIAFANQAEALAAAMQAAANgEALQgFAMgIAKQgJAIgMAGQgNAFgQAAQgPAAgNgFgAgRgdQgHAEgEAJQgEAHAAAJQAAAJAEAJQAEAHAHAFQAIAFAJAAQALAAAHgFQAIgFADgHQAEgJAAgJQAAgJgEgHQgDgJgIgEQgHgFgLABQgJgBgIAFg");
	this.shape_6.setTransform(93.6,38.4);

	this.shape_7 = new cjs.Shape();
	this.shape_7.graphics.f("#633D0C").s().p("AAWA+IAAgoIgLAAIgcAoIgmAAIAigtQgLgEgIgJQgGgHgBgPQABgQAGgKQAIgJALgEQAMgFALAAIA2AAIAAB8gAgIgdQgEADgBAIQABAHAEAEQAFADAGABIATAAIAAgdIgTAAQgGgBgFAEg");
	this.shape_7.setTransform(192.9,18.4);

	this.shape_8 = new cjs.Shape();
	this.shape_8.graphics.f("#633D0C").s().p("AgIA+QgMgEgKgIQgKgHgGgNQgFgMAAgQQAAgQAFgNQAGgNAKgIQAKgIAMgEQAKgEANAAQAJAAAKACQAJACAIAEIAAAfQgGgEgIgDQgIgDgJAAQgKAAgJAEQgHAEgFAIQgGAJAAAMQAAAMAGAHQAFAIAHAEQAJADAKAAQAKAAAIgDQAJgDAFgFIAAAhQgIADgJACQgKACgKAAQgNAAgKgDg");
	this.shape_8.setTransform(180.6,18.4);

	this.shape_9 = new cjs.Shape();
	this.shape_9.graphics.f("#633D0C").s().p("AgzA+IAAh8IAhAAIAAAoIARAAQAOAAAMAEQAMAEAIAKQAHAHAAARQAAAQgHAJQgIAKgMADQgMAEgOAAgAgSAhIASAAQAEABAEgCQAEgBADgDQADgDAAgFQAAgHgDgCQgDgEgEgBIgIgBIgSAAg");
	this.shape_9.setTransform(168.6,18.4);

	this.shape_10 = new cjs.Shape();
	this.shape_10.graphics.f("#633D0C").s().p("AgPA+IAAheIgkAAIAAgeIBnAAIAAAeIgkAAIAABeg");
	this.shape_10.setTransform(156.3,18.4);

	this.shape_11 = new cjs.Shape();
	this.shape_11.graphics.f("#633D0C").s().p("AAXA+IAAgzIAAgKIABgJIgwBGIgfAAIAAh8IAhAAIAAA0IAAAKIgBAJIAwhHIAfAAIAAB8g");
	this.shape_11.setTransform(143.5,18.4);

	this.shape_12 = new cjs.Shape();
	this.shape_12.graphics.f("#633D0C").s().p("AgzA+IAAh8IA2AAQAVABAMAHQALAIAAARQAAAJgEAIQgGAGgJAEQALACAHAGQAGAIABANQAAALgFAGQgFAHgHAFQgIAEgJABIgSABgAgSAlIAUAAQAIgBAEgDQAFgCAAgIQAAgHgFgDQgEgDgIAAIgUAAgAgSgMIASAAQAHAAADgDQAEgDAAgFQAAgGgEgDQgDgEgHAAIgSAAg");
	this.shape_12.setTransform(130.3,18.4);

	this.shape_13 = new cjs.Shape();
	this.shape_13.graphics.f("#633D0C").s().p("AAhA+IgHgUIgyAAIgHAUIgjAAIAxh8IAiAAIAyB8gAAQAPIgNgiIgBgEIgCgIIAAAIIgCAEIgMAiIAeAAg");
	this.shape_13.setTransform(116.5,18.4);

	this.shape_14 = new cjs.Shape();
	this.shape_14.graphics.f("#633D0C").s().p("Ag0A+IAAh8IBeAAIAAAeIg8AAIAAAPIAXAAQAMAAALAEQALAEAHAIQAGAHABAQQgBAQgGAJQgHAIgLAEQgLADgMAAgAgSAhIAWAAQAGABAEgCQAEgDAAgHQAAgHgEgDQgEgCgGAAIgWAAg");
	this.shape_14.setTransform(103.5,18.4);

	this.shape_15 = new cjs.Shape();
	this.shape_15.graphics.f("#633D0C").s().p("AgXBAQgMgDgOgEIAAggQANAHAMACQALACAJgBIAJgBQAGgBACgCQADgDAAgFQABgGgFgDQgFgCgHABIgcAAIAAgbIAcAAQAEAAAEgDQADgCABgEQAAgGgGgCQgEgDgJgBQgIABgJACQgLACgMAGIAAggQAMgFALgCQAKgBAKAAQANAAAMAEQALAEAHAHQAGAIAAAMQAAAJgGAIQgEAGgKAEQAHACAGACQAGAEADAHQADAGAAAJQAAALgFAHQgEAHgIAFQgHADgKADIgRABIgEAAQgJAAgJgBg");
	this.shape_15.setTransform(91,18.4);

	this.shape_16 = new cjs.Shape();
	this.shape_16.graphics.f("#633D0C").s().p("AAXA+IAAgzIAAgKIAAgJIguBGIggAAIAAh8IAhAAIAAA0IAAAKIAAAJIAvhHIAfAAIAAB8g");
	this.shape_16.setTransform(77.9,18.4);

	this.timeline.addTween(cjs.Tween.get({}).to({state:[{t:this.shape_16},{t:this.shape_15},{t:this.shape_14},{t:this.shape_13},{t:this.shape_12},{t:this.shape_11},{t:this.shape_10},{t:this.shape_9},{t:this.shape_8},{t:this.shape_7},{t:this.shape_6},{t:this.shape_5},{t:this.shape_4},{t:this.shape_3},{t:this.shape_2},{t:this.shape_1},{t:this.shape}]}).wait(91));

	// Слой 1
	this.shape_17 = new cjs.Shape();
	this.shape_17.graphics.f("#FEC006").s().p("AqOEkQhlgBABhjIAAl/QgBhjBlgBIUeAAQBkABAABjIAAF/QAABjhkABg");
	this.shape_17.setTransform(135.6,29.2);

	this.timeline.addTween(cjs.Tween.get(this.shape_17).wait(91));

	// Слой 2
	this.shape_18 = new cjs.Shape();
	this.shape_18.graphics.f("#CE7E0C").s().p("AqOEkQhlAAABhlIAAl9QgBhlBlABIUeAAQBkgBAABlIAAF9QAABlhkAAg");
	this.shape_18.setTransform(135.6,35.2);

	this.timeline.addTween(cjs.Tween.get(this.shape_18).wait(91));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(60,0,151.2,64.4);


(lib.slide3 = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// timeline functions:
	this.frame_199 = function() {
		this.stop();
	}

	// actions tween:
	this.timeline.addTween(cjs.Tween.get(this).wait(199).call(this.frame_199).wait(1));

	// Слой 7
	this.instance = new lib.btn3();
	this.instance.setTransform(658.7,50.4,0.267,0.267,0,0,0,135.6,29.2);
	this.instance.alpha = 0;
	this.instance._off = true;

	this.timeline.addTween(cjs.Tween.get(this.instance).wait(114).to({_off:false},0).to({regX:135.7,regY:29.3,scaleX:0.88,scaleY:0.88,x:658.8,y:50.5,alpha:1},11,cjs.Ease.get(-1)).to({scaleX:0.8,scaleY:0.8},4).to({regX:135.6,regY:29.2,scaleX:0.83,scaleY:0.83,x:658.7,y:50.4},2).wait(69));

	// Слой 6
	this.instance_1 = new lib.txt2_3();
	this.instance_1.setTransform(507.9,45.5,0.744,0.744,0,0,0,134.4,46.1);
	this.instance_1._off = true;

	this.timeline.addTween(cjs.Tween.get(this.instance_1).wait(75).to({_off:false},0).wait(125));

	// Слой 10
	this.instance_2 = new lib.pro();
	this.instance_2.setTransform(357.9,54.8,0.471,0.471,0,0,0,150.4,299.9);
	this.instance_2._off = true;

	this.timeline.addTween(cjs.Tween.get(this.instance_2).wait(60).to({_off:false},0).wait(140));

	// Слой 4
	this.instance_3 = new lib.txt1();
	this.instance_3.setTransform(232.7,37.2,0.656,0.656,0,0,0,119.3,39.1);
	this.instance_3._off = true;

	this.timeline.addTween(cjs.Tween.get(this.instance_3).wait(50).to({_off:false},0).wait(150));

	// Слой 3
	this.instance_4 = new lib.blue();
	this.instance_4.setTransform(150.1,393,3.063,4.138,0,0,0,49,72.5);
	this.instance_4.alpha = 0.801;
	this.instance_4._off = true;

	this.timeline.addTween(cjs.Tween.get(this.instance_4).wait(39).to({_off:false},0).to({y:300},20,cjs.Ease.get(1)).wait(141));

	// Слой 9
	this.instance_5 = new lib.pic3_728();
	this.instance_5.setTransform(174,0);

	this.timeline.addTween(cjs.Tween.get(this.instance_5).wait(200));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(0,0,728,600);


(lib.slide2 = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// timeline functions:
	this.frame_238 = function() {
		this.stop();
	}

	// actions tween:
	this.timeline.addTween(cjs.Tween.get(this).wait(238).call(this.frame_238).wait(1));

	// Слой 7
	this.instance = new lib.btn2();
	this.instance.setTransform(660.3,47.8,0.132,0.132,0,0,0,135.8,29.2);
	this.instance.alpha = 0;
	this.instance._off = true;

	this.timeline.addTween(cjs.Tween.get(this.instance).wait(153).to({_off:false},0).to({regY:29.3,scaleX:0.65,scaleY:0.65,x:660.4,alpha:1},11,cjs.Ease.get(-1)).to({regY:29.4,scaleX:0.58,scaleY:0.58,x:660.3,y:47.9},4).to({regX:135.7,regY:29.3,scaleX:0.61,scaleY:0.61},2).wait(69));

	// Слой 6
	this.instance_1 = new lib.txt2_2();
	this.instance_1.setTransform(513.4,45.5,0.695,0.695,0,0,0,134.4,46.1);
	this.instance_1._off = true;

	this.timeline.addTween(cjs.Tween.get(this.instance_1).wait(114).to({_off:false},0).wait(125));

	// Слой 11
	this.instance_2 = new lib.pro();
	this.instance_2.setTransform(357.9,54.8,0.471,0.471,0,0,0,150.4,299.9);
	this.instance_2._off = true;

	this.timeline.addTween(cjs.Tween.get(this.instance_2).wait(99).to({_off:false},0).wait(140));

	// Слой 10
	this.instance_3 = new lib.txt1();
	this.instance_3.setTransform(232.7,37.2,0.656,0.656,0,0,0,119.3,39.1);
	this.instance_3._off = true;

	this.timeline.addTween(cjs.Tween.get(this.instance_3).wait(89).to({_off:false},0).wait(150));

	// Слой 3
	this.instance_4 = new lib.blue();
	this.instance_4.setTransform(150.1,393,3.063,4.138,0,0,0,49,72.5);
	this.instance_4.alpha = 0.801;
	this.instance_4._off = true;

	this.timeline.addTween(cjs.Tween.get(this.instance_4).wait(78).to({_off:false},0).to({y:300},20,cjs.Ease.get(1)).wait(141));

	// Слой 9
	this.instance_5 = new lib.Символ4();
	this.instance_5.setTransform(451.5,-46,1,1,0,0,0,276.5,136);

	this.timeline.addTween(cjs.Tween.get(this.instance_5).wait(24).to({y:45},17,cjs.Ease.get(-1)).to({y:136},17,cjs.Ease.get(1)).wait(181));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(0,-182,728,782);


(lib.slide1 = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// timeline functions:
	this.frame_199 = function() {
		this.stop();
	}

	// actions tween:
	this.timeline.addTween(cjs.Tween.get(this).wait(199).call(this.frame_199).wait(1));

	// Слой 12
	this.instance = new lib.btn1();
	this.instance.setTransform(659.6,44.5,0.221,0.221,0,0,0,135.8,29.4);
	this.instance.alpha = 0;
	this.instance._off = true;

	this.timeline.addTween(cjs.Tween.get(this.instance).wait(114).to({_off:false},0).to({regX:135.7,scaleX:0.84,scaleY:0.84,x:659.7,alpha:1},11,cjs.Ease.get(-1)).to({regY:29.3,scaleX:0.74,scaleY:0.74},4).to({regX:135.6,scaleX:0.78,scaleY:0.78,x:659.6},2).wait(69));

	// Слой 6
	this.instance_1 = new lib.txt2();
	this.instance_1.setTransform(511.3,45.7,0.778,0.778,0,0,0,134.3,46);
	this.instance_1._off = true;

	this.timeline.addTween(cjs.Tween.get(this.instance_1).wait(75).to({_off:false},0).wait(125));

	// Слой 10
	this.instance_2 = new lib.pro();
	this.instance_2.setTransform(357.9,54.8,0.471,0.471,0,0,0,150.4,299.9);
	this.instance_2._off = true;

	this.timeline.addTween(cjs.Tween.get(this.instance_2).wait(60).to({_off:false},0).wait(140));

	// Слой 11
	this.instance_3 = new lib.txt1();
	this.instance_3.setTransform(232.7,37.2,0.656,0.656,0,0,0,119.3,39.1);
	this.instance_3._off = true;

	this.timeline.addTween(cjs.Tween.get(this.instance_3).wait(50).to({_off:false},0).wait(150));

	// Слой 3
	this.instance_4 = new lib.blue();
	this.instance_4.setTransform(150.1,391.4,3.063,4.138,0,0,0,49,72.5);
	this.instance_4.alpha = 0.801;
	this.instance_4._off = true;

	this.timeline.addTween(cjs.Tween.get(this.instance_4).wait(39).to({_off:false},0).to({y:300},20,cjs.Ease.get(1)).wait(141));

	// Слой 9
	this.instance_5 = new lib.pic1_728();
	this.instance_5.setTransform(176,0);

	this.timeline.addTween(cjs.Tween.get(this.instance_5).wait(200));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(0,0,728,600);


(lib.main = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// Слой 2
	this.instance = new lib.logo_1();
	this.instance.setTransform(150,31,1,1,0,0,0,150,31);

	this.timeline.addTween(cjs.Tween.get(this.instance).wait(662));

	// Слой 6
	this.instance_1 = new lib.Анимация2("synched",0);
	this.instance_1.setTransform(452,135);
	this.instance_1._off = true;

	this.timeline.addTween(cjs.Tween.get(this.instance_1).wait(641).to({_off:false},0).to({y:94.5},9,cjs.Ease.get(-1)).to({y:45},11,cjs.Ease.get(1)).wait(1));

	// Слой 4
	this.instance_2 = new lib.slide3();
	this.instance_2.setTransform(150,390,1,1,0,0,0,150,300);
	this.instance_2._off = true;

	this.timeline.addTween(cjs.Tween.get(this.instance_2).wait(441).to({_off:false},0).to({y:345},10,cjs.Ease.get(-1)).to({y:300},10,cjs.Ease.get(1)).wait(180).to({y:259.5},9,cjs.Ease.get(-1)).to({y:210},11,cjs.Ease.get(1)).wait(1));

	// Слой 1
	this.instance_3 = new lib.slide1();
	this.instance_3.setTransform(150,300,1,1,0,0,0,150,300);

	this.timeline.addTween(cjs.Tween.get(this.instance_3).wait(199).to({y:255},10,cjs.Ease.get(-1)).to({y:210},10,cjs.Ease.get(1)).to({_off:true},1).wait(442));

	// Слой 3
	this.instance_4 = new lib.slide2();
	this.instance_4.setTransform(150,390,1,1,0,0,0,150,300);
	this.instance_4._off = true;

	this.timeline.addTween(cjs.Tween.get(this.instance_4).wait(199).to({_off:false},0).to({y:345},10,cjs.Ease.get(-1)).to({y:300},10,cjs.Ease.get(1)).wait(222).to({y:255},10,cjs.Ease.get(-1)).to({y:210},10,cjs.Ease.get(1)).to({_off:true},1).wait(200));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(0,0,728,90);


// stage content:



(lib.mywhirl_728x90 = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// Слой 1
	this.instance = new lib.main();
	this.instance.setTransform(150,300,1,1,0,0,0,150,300);

	this.timeline.addTween(cjs.Tween.get(this.instance).wait(1));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(364,45,728,90);

})(lib = lib||{}, images = images||{}, createjs = createjs||{}, ss = ss||{});
var lib, images, createjs, ss;