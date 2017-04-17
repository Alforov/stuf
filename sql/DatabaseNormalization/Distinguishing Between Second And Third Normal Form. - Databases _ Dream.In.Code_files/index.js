(function (lib, img, cjs, ss, an) {

var p; // shortcut to reference prototypes
lib.ssMetadata = [
		{name:"index_atlas_P_", frames: [[302,170,102,134],[339,413,152,20],[185,413,152,20],[180,364,208,47],[0,0,178,383],[180,306,183,56],[443,0,17,291],[462,0,17,291],[0,413,183,42],[180,0,120,257],[302,0,139,168],[180,259,104,15],[0,385,155,23]]}
];


// symbols:



(lib.astronaut_970 = function() {
	this.spriteSheet = ss["index_atlas_P_"];
	this.gotoAndStop(0);
}).prototype = p = new cjs.Sprite();



(lib.back_970 = function() {
	this.initialize(img.back_970);
}).prototype = p = new cjs.Bitmap();
p.nominalBounds = new cjs.Rectangle(0,0,1005,259);


(lib.gal_s8_970 = function() {
	this.spriteSheet = ss["index_atlas_P_"];
	this.gotoAndStop(1);
}).prototype = p = new cjs.Sprite();



(lib.gal_s8_970_bl = function() {
	this.spriteSheet = ss["index_atlas_P_"];
	this.gotoAndStop(2);
}).prototype = p = new cjs.Sprite();



(lib.legal_97090 = function() {
	this.spriteSheet = ss["index_atlas_P_"];
	this.gotoAndStop(3);
}).prototype = p = new cjs.Sprite();



(lib.phone = function() {
	this.spriteSheet = ss["index_atlas_P_"];
	this.gotoAndStop(4);
}).prototype = p = new cjs.Sprite();



(lib.phone_bottom = function() {
	this.spriteSheet = ss["index_atlas_P_"];
	this.gotoAndStop(5);
}).prototype = p = new cjs.Sprite();



(lib.phone_left = function() {
	this.spriteSheet = ss["index_atlas_P_"];
	this.gotoAndStop(6);
}).prototype = p = new cjs.Sprite();



(lib.phone_right = function() {
	this.spriteSheet = ss["index_atlas_P_"];
	this.gotoAndStop(7);
}).prototype = p = new cjs.Sprite();



(lib.phone_top = function() {
	this.spriteSheet = ss["index_atlas_P_"];
	this.gotoAndStop(8);
}).prototype = p = new cjs.Sprite();



(lib.product1 = function() {
	this.spriteSheet = ss["index_atlas_P_"];
	this.gotoAndStop(9);
}).prototype = p = new cjs.Sprite();



(lib.product3 = function() {
	this.spriteSheet = ss["index_atlas_P_"];
	this.gotoAndStop(10);
}).prototype = p = new cjs.Sprite();



(lib.samsung_970_bl = function() {
	this.spriteSheet = ss["index_atlas_P_"];
	this.gotoAndStop(11);
}).prototype = p = new cjs.Sprite();



(lib.samsung_final_970 = function() {
	this.spriteSheet = ss["index_atlas_P_"];
	this.gotoAndStop(12);
}).prototype = p = new cjs.Sprite();
// helper functions:

function mc_symbol_clone() {
	var clone = this._cloneProps(new this.constructor(this.mode, this.startPosition, this.loop));
	clone.gotoAndStop(this.currentFrame);
	clone.paused = this.paused;
	clone.framerate = this.framerate;
	return clone;
}

function getMCSymbolPrototype(symbol, nominalBounds, frameBounds) {
	var prototype = cjs.extend(symbol, cjs.MovieClip);
	prototype.clone = mc_symbol_clone;
	prototype.nominalBounds = nominalBounds;
	prototype.frameBounds = frameBounds;
	return prototype;
	}


(lib.white = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// Layer 1
	this.shape = new cjs.Shape();
	this.shape.graphics.f("#FFFFFF").s().p("EhOlAWqMAAAgtTMCdLAAAMAAAAtTgAUAF8IFyAAIAAsLIlyAAg");
	this.shape.setTransform(-190,0);

	this.timeline.addTween(cjs.Tween.get(this.shape).wait(1));

}).prototype = getMCSymbolPrototype(lib.white, new cjs.Rectangle(-693,-145,1006,290), null);


(lib.txt3 = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// Layer 1
	this.shape = new cjs.Shape();
	this.shape.graphics.f("#000000").s().p("AgHBCQgDgEAAgEQAAgGADgCQADgDAEgBQAFAAADADQADADAAAGQAAAEgDAEQgDADgFAAQgEAAgDgDgAgFAeIgDhhIARAAIgDBhg");
	this.shape.setTransform(53.9,11.1);

	this.shape_1 = new cjs.Shape();
	this.shape_1.graphics.f("#000000").s().p("AAWAyIgdgtIgEACIgNAGIAAAlIgPAAIAAhjIAPAAIAAAxIAIgEIAQgKQAGgEAFgIQAEgIADgPIAQAAQgFAVgHAKQgGAKgLAHIAjAzg");
	this.shape_1.setTransform(46.1,12.7);

	this.shape_2 = new cjs.Shape();
	this.shape_2.graphics.f("#000000").s().p("AgeAnQgKgNgBgaQABgYAKgOQALgNAUAAQATAAALANQAKANAAAZQAAAZgKAOQgLANgUAAQgTAAgLgNgAgSgcQgHAKAAASQAAATAHAKQAGAKAMAAQANAAAHgKQAGgKAAgTQAAgSgGgKQgHgKgMAAQgNAAgGAKg");
	this.shape_2.setTransform(35.3,12.7);

	this.shape_3 = new cjs.Shape();
	this.shape_3.graphics.f("#000000").s().p("AAXAyIAAgsIgtAAIAAAsIgPAAIAAhjIAPAAIAAAqIAtAAIAAgqIAPAAIAABjg");
	this.shape_3.setTransform(24.7,12.7);

	this.shape_4 = new cjs.Shape();
	this.shape_4.graphics.f("#000000").s().p("AgpA5QANgFAJgGQAIgGAFgKIgjhjIAQAAIAZBRIAbhRIAPAAIgiBjQgJAcgjAMg");
	this.shape_4.setTransform(14.6,14.7);

	this.shape_5 = new cjs.Shape();
	this.shape_5.graphics.f("#000000").s().p("AgnBGIAAiJIAOAAIAAANQAFgHAHgEQAIgEAIAAQARAAAKAOQAKAOAAAZQAAAXgKAOQgLANgSAAQgHAAgHgDQgGgDgFgFIAAAvgAgNg0QgGADgFAGIAAA0QAFAGAGADQAHACAGAAQAMAAAGgJQAGgJAAgSQAAgTgGgKQgHgKgLAAQgHAAgGADg");
	this.shape_5.setTransform(4.9,14.5);

	this.shape_6 = new cjs.Shape();
	this.shape_6.graphics.f("#000000").s().p("AgcAsQgJgHAAgOQAAgTAPgGQAOgJAfAAIAAgHQAAgJgHgFQgFgFgLAAQgMAAgLAFIgEgMQAOgHAOAAQARAAAJAIQAKAJAAAPIAABFIgNAAIAAgNQgKAPgTAAQgPAAgIgIgAgLAFQgKAGAAAKQAAAJAEAEQAGAFAJgBQAHAAAGgDQAGgCAGgGIAAgbQgXAAgLAFg");
	this.shape_6.setTransform(-6,12.7);

	this.shape_7 = new cjs.Shape();
	this.shape_7.graphics.f("#000000").s().p("AAnBAIgDgcIhHAAIgDAcIgMAAIAAgpIAHAAQALgGAEgIQADgIABgOIAFgxIA3AAIAABVIAPAAIAAApgAgJgLQgBAMgDAIQgDAIgIAGIAtAAIAAhIIgaAAg");
	this.shape_7.setTransform(-16.3,14.1);

	this.shape_8 = new cjs.Shape();
	this.shape_8.graphics.f("#000000").s().p("AgeAnQgLgNAAgaQAAgYALgOQALgNAUAAQATAAALANQAKANAAAZQAAAZgKAOQgLANgUAAQgTAAgLgNgAgTgcQgGAKAAASQAAATAGAKQAIAKALAAQANAAAHgKQAGgKAAgTQAAgSgGgKQgHgKgMAAQgMAAgIAKg");
	this.shape_8.setTransform(-26.9,12.7);

	this.shape_9 = new cjs.Shape();
	this.shape_9.graphics.f("#000000").s().p("AAXAyIAAhWIgtAAIAABWIgPAAIAAhjIBLAAIAABjg");
	this.shape_9.setTransform(-37.6,12.7);

	this.shape_10 = new cjs.Shape();
	this.shape_10.graphics.f("#000000").s().p("AgkAyIAAhjIAkAAQAPAAAIAHQAIAHAAANQAAAHgDAFQgEAFgGADQAJACAFAGQAFAGAAAJQAAAOgJAHQgIAIgPAAgAgVAlIAaAAQAHAAAFgEQAEgEAAgIQAAgIgEgEQgFgEgIAAIgZAAgAgVgGIAWAAQAHAAAFgEQAEgEAAgHQAAgHgFgEQgEgEgIAAIgVAAg");
	this.shape_10.setTransform(-51.8,12.7);

	this.shape_11 = new cjs.Shape();
	this.shape_11.graphics.f("#000000").s().p("AgpA5QANgFAJgGQAIgHAFgJIgjhjIAQAAIAZBRIAbhRIAPAAIgiBjQgJAcgjAMg");
	this.shape_11.setTransform(132,-8);

	this.shape_12 = new cjs.Shape();
	this.shape_12.graphics.f("#000000").s().p("AAWAyIgdgtIgEACIgNAGIAAAlIgPAAIAAhjIAPAAIAAAxIAIgEIAQgKQAGgEAFgIQAEgIADgPIAQAAQgFAVgHAKQgGAKgLAHIAjAzg");
	this.shape_12.setTransform(122.8,-10.1);

	this.shape_13 = new cjs.Shape();
	this.shape_13.graphics.f("#000000").s().p("AAnBAIgDgcIhHAAIgDAcIgMAAIAAgpIAHAAQALgGAEgIQADgIABgOIAFgxIA3AAIAABVIAPAAIAAApgAgJgLQgBAMgDAIQgDAHgIAHIAtAAIAAhJIgaAAg");
	this.shape_13.setTransform(111.3,-8.7);

	this.shape_14 = new cjs.Shape();
	this.shape_14.graphics.f("#000000").s().p("AAXAyIAAglIgUAAIgXAlIgRAAIAagnQgTgHAAgWQAAgOAJgIQAJgJANAAIAlAAIAABjgAgKgfQgFAFAAAJQAAAJAFAFQAFAEAIAAIAUAAIAAglIgUAAQgIAAgFAFg");
	this.shape_14.setTransform(100.4,-10.1);

	this.shape_15 = new cjs.Shape();
	this.shape_15.graphics.f("#000000").s().p("AgnBGIAAiJIAOAAIAAANQAFgHAHgEQAIgEAIAAQARAAAKAOQAKAOAAAZQAAAXgKAOQgLANgSAAQgHAAgHgDQgGgDgFgFIAAAvgAgNg0QgGADgFAGIAAA0QAFAGAGADQAHACAGAAQAMAAAGgJQAGgJAAgSQAAgTgGgKQgHgKgLAAQgHAAgGADg");
	this.shape_15.setTransform(91,-8.3);

	this.shape_16 = new cjs.Shape();
	this.shape_16.graphics.f("#000000").s().p("AgcAsQgJgIAAgNQAAgTAPgGQAPgJAeAAIAAgHQAAgJgHgFQgFgFgLAAQgMAAgLAGIgEgNQAOgHAPAAQAQAAAJAIQALAIAAAQIAABFIgPAAIAAgNQgJAPgTAAQgPAAgIgIgAgLAFQgKAGAAAKQAAAJAEAEQAGAFAJAAQAHgBAGgDQAGgDAGgFIAAgbQgXAAgLAFg");
	this.shape_16.setTransform(80,-10.1);

	this.shape_17 = new cjs.Shape();
	this.shape_17.graphics.f("#000000").s().p("AgVAzQgIgCgGgEIAFgMIAMAEIAMACQAMAAAIgFQAGgEAAgJQAAgPgXAAIgPAAIAAgMIAPAAQAIAAAGgEQAFgEABgHQAAgJgHgEQgFgDgJgBQgKABgMAFIgFgNQAGgDAHgBQAJgCAHAAQAOAAAKAGQAKAIAAANQAAAPgPAHQAJACAEAGQAGAGAAAKQAAAPgLAHQgMAIgRAAIgRgBg");
	this.shape_17.setTransform(71.2,-10.1);

	this.shape_18 = new cjs.Shape();
	this.shape_18.graphics.f("#000000").s().p("AgpA5QANgFAJgGQAIgHAFgJIgjhjIAQAAIAZBRIAbhRIAPAAIgiBjQgJAcgjAMg");
	this.shape_18.setTransform(58.2,-8);

	this.shape_19 = new cjs.Shape();
	this.shape_19.graphics.f("#000000").s().p("AgkAyIAAhjIAkAAQAPAAAIAHQAIAHAAANQAAAHgDAFQgEAFgGADQAJACAFAGQAFAGAAAJQAAAOgJAHQgIAIgPAAgAgVAlIAaAAQAHAAAFgEQAEgEAAgIQAAgIgEgEQgFgEgIAAIgZAAgAgVgGIAWAAQAHAAAFgEQAEgEAAgHQAAgHgFgEQgEgEgIAAIgVAAg");
	this.shape_19.setTransform(49.1,-10.1);

	this.shape_20 = new cjs.Shape();
	this.shape_20.graphics.f("#000000").s().p("AgeAnQgKgNgBgaQABgYAKgOQALgNAUAAQATAAALANQALANgBAZQABAZgLAOQgLANgUAAQgTAAgLgNgAgSgcQgHAKAAASQAAATAHAKQAGAKAMAAQANAAAHgKQAGgKAAgTQAAgSgGgKQgHgKgMAAQgNAAgGAKg");
	this.shape_20.setTransform(38.6,-10.1);

	this.shape_21 = new cjs.Shape();
	this.shape_21.graphics.f("#000000").s().p("AgHAyIAAhWIgbAAIAAgNIBFAAIAAANIgcAAIAABWg");
	this.shape_21.setTransform(29.3,-10.1);

	this.shape_22 = new cjs.Shape();
	this.shape_22.graphics.f("#000000").s().p("AgdAnQgMgNABgaQgBgYAMgOQAKgNATAAQAUAAALANQAKANAAAZQAAAZgKAOQgLANgUAAQgTAAgKgNgAgTgcQgGAKAAASQAAATAGAKQAIAKALAAQANAAAHgKQAGgKAAgTQAAgSgGgKQgHgKgNAAQgMAAgHAKg");
	this.shape_22.setTransform(20.2,-10.1);

	this.shape_23 = new cjs.Shape();
	this.shape_23.graphics.f("#000000").s().p("AgnBGIAAiJIAOAAIAAANQAFgHAHgEQAIgEAIAAQARAAAKAOQAKAOAAAZQAAAXgKAOQgLANgSAAQgHAAgHgDQgGgDgFgFIAAAvgAgNg0QgGADgFAGIAAA0QAFAGAGADQAHACAGAAQAMAAAGgJQAGgJAAgSQAAgTgGgKQgHgKgLAAQgHAAgGADg");
	this.shape_23.setTransform(10,-8.3);

	this.shape_24 = new cjs.Shape();
	this.shape_24.graphics.f("#000000").s().p("AAnBAIgDgcIhHAAIgDAcIgMAAIAAgpIAHAAQALgGAEgIQADgIABgOIAFgxIA3AAIAABVIAPAAIAAApgAgJgLQgBAMgDAIQgDAHgIAHIAtAAIAAhJIgaAAg");
	this.shape_24.setTransform(-1.5,-8.7);

	this.shape_25 = new cjs.Shape();
	this.shape_25.graphics.f("#000000").s().p("AgVAzQgIgCgGgEIAFgMIAMAEIAMACQANAAAGgFQAHgEAAgJQAAgPgXAAIgPAAIAAgMIAPAAQAIAAAGgEQAFgEABgHQAAgJgHgEQgFgDgJgBQgKABgMAFIgFgNQAGgDAIgBQAHgCAIAAQAOAAAKAGQAKAIAAANQAAAPgPAHQAIACAFAGQAGAGAAAKQAAAPgLAHQgMAIgRAAIgRgBg");
	this.shape_25.setTransform(-11.3,-10.1);

	this.shape_26 = new cjs.Shape();
	this.shape_26.graphics.f("#000000").s().p("AgcAnQgMgOAAgZQAAgYALgNQALgOATAAQATAAAKANQALANAAAWIgBAIIhAAAQABAQAHAJQAIAIANAAQAOAAALgHIAGALQgGAFgIADQgJACgJAAQgUAAgMgNgAgYgHIAyAAQgBgOgGgIQgHgIgMgBQgVAAgDAfg");
	this.shape_26.setTransform(-20.3,-10.1);

	this.shape_27 = new cjs.Shape();
	this.shape_27.graphics.f("#000000").s().p("AgfA4QgKgOAAgaQAAgWADgPQADgQAHgKQAJgLAOgFQANgEAZgCIABAOQgWACgLADQgLADgEAIQgHAIgCASQAMgKAPAAQASAAAKALQAKALAAAWQAAAPgFAMQgGALgJAFQgKAGgMAAQgUAAgLgOgAgMgIQgHADgFAFIgBARQAAAoAZAAQAMAAAHgKQAIgJgBgRQABgRgHgGQgGgIgNAAQgHAAgGACg");
	this.shape_27.setTransform(-30.6,-11.9);

	this.shape_28 = new cjs.Shape();
	this.shape_28.graphics.f("#000000").s().p("AAYBGIAAhKIgwBKIgOAAIAAhiIAPAAIAABKIAvhKIAPAAIAABigAgSgxQgIgIgBgMIAKAAQACAGAEAEQAFAEAIgBQARABADgOIAKAAQgCANgHAGQgIAHgNAAQgNAAgHgGg");
	this.shape_28.setTransform(-45.7,-12.1);

	this.shape_29 = new cjs.Shape();
	this.shape_29.graphics.f("#000000").s().p("AgcAsQgIgIAAgNQAAgTAOgGQAOgJAfAAIAAgHQgBgJgFgFQgGgFgLAAQgMAAgLAGIgEgNQAOgHAOAAQAQAAAKAIQALAIgBAQIAABFIgNAAIAAgNQgKAPgUAAQgOAAgIgIgAgKAFQgLAGAAAKQAAAJAEAEQAGAFAJAAQAHgBAGgDQAGgDAGgFIAAgbQgXAAgKAFg");
	this.shape_29.setTransform(-56.6,-10.1);

	this.shape_30 = new cjs.Shape();
	this.shape_30.graphics.f("#000000").s().p("AAjAyIAAhMIgdA6IgMAAIgcg6IAABMIgOAAIAAhjIASAAIAeBAIAghAIARAAIAABjg");
	this.shape_30.setTransform(-67.7,-10.1);

	this.shape_31 = new cjs.Shape();
	this.shape_31.graphics.f("#000000").s().p("AAYAyIAAhKIgwBKIgOAAIAAhjIAPAAIAABKIAvhKIAPAAIAABjg");
	this.shape_31.setTransform(-80,-10.1);

	this.shape_32 = new cjs.Shape();
	this.shape_32.graphics.f("#000000").s().p("AgnBGIAAiJIAOAAIAAANQAFgHAHgEQAIgEAIAAQARAAAKAOQAKAOAAAZQAAAXgKAOQgLANgSAAQgHAAgHgDQgGgDgFgFIAAAvgAgNg0QgGADgFAGIAAA0QAFAGAGADQAHACAGAAQAMAAAGgJQAGgJAAgSQAAgTgGgKQgHgKgLAAQgHAAgGADg");
	this.shape_32.setTransform(-90.6,-8.3);

	this.shape_33 = new cjs.Shape();
	this.shape_33.graphics.f("#000000").s().p("AgHAyIAAhWIgbAAIAAgNIBFAAIAAANIgcAAIAABWg");
	this.shape_33.setTransform(-100.3,-10.1);

	this.shape_34 = new cjs.Shape();
	this.shape_34.graphics.f("#000000").s().p("AgeAnQgKgNgBgaQABgYAKgOQALgNAUAAQATAAALANQALANgBAZQABAZgLAOQgLANgUAAQgTAAgLgNgAgSgcQgHAKAAASQAAATAHAKQAGAKAMAAQANAAAGgKQAHgKAAgTQAAgSgHgKQgGgKgMAAQgNAAgGAKg");
	this.shape_34.setTransform(-109.5,-10.1);

	this.shape_35 = new cjs.Shape();
	this.shape_35.graphics.f("#000000").s().p("AgcAsQgIgIAAgNQAAgTAOgGQAOgJAfAAIAAgHQgBgJgFgFQgGgFgLAAQgMAAgLAGIgEgNQAOgHAOAAQAQAAAKAIQALAIgBAQIAABFIgNAAIAAgNQgKAPgUAAQgOAAgIgIgAgKAFQgLAGAAAKQAAAJAEAEQAGAFAJAAQAHgBAGgDQAGgDAGgFIAAgbQgXAAgKAFg");
	this.shape_35.setTransform(-124.1,-10.1);

	this.shape_36 = new cjs.Shape();
	this.shape_36.graphics.f("#000000").s().p("AgHAyIAAhWIgbAAIAAgNIBFAAIAAANIgcAAIAABWg");
	this.shape_36.setTransform(-132.7,-10.1);

	this.timeline.addTween(cjs.Tween.get({}).to({state:[{t:this.shape_36},{t:this.shape_35},{t:this.shape_34},{t:this.shape_33},{t:this.shape_32},{t:this.shape_31},{t:this.shape_30},{t:this.shape_29},{t:this.shape_28},{t:this.shape_27},{t:this.shape_26},{t:this.shape_25},{t:this.shape_24},{t:this.shape_23},{t:this.shape_22},{t:this.shape_21},{t:this.shape_20},{t:this.shape_19},{t:this.shape_18},{t:this.shape_17},{t:this.shape_16},{t:this.shape_15},{t:this.shape_14},{t:this.shape_13},{t:this.shape_12},{t:this.shape_11},{t:this.shape_10},{t:this.shape_9},{t:this.shape_8},{t:this.shape_7},{t:this.shape_6},{t:this.shape_5},{t:this.shape_4},{t:this.shape_3},{t:this.shape_2},{t:this.shape_1},{t:this.shape}]}).wait(1));

}).prototype = getMCSymbolPrototype(lib.txt3, new cjs.Rectangle(-138.8,-24.7,277.6,49.5), null);


(lib.txt2 = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// Layer 1
	this.shape = new cjs.Shape();
	this.shape.graphics.f("#FFFFFF").s().p("AAaA3IAAgoIgWAAIgaAoIgUAAIAegrQgWgHAAgYQAAgQAKgKQAKgJAPAAIAqAAIAABtgAgLgjQgFAGgBAKQABAKAFAFQAFAFAJAAIAXAAIAAgoIgWAAQgJAAgGAEg");
	this.shape.setTransform(80.7,14);

	this.shape_1 = new cjs.Shape();
	this.shape_1.graphics.f("#FFFFFF").s().p("AAZA3IAAgwIgxAAIAAAwIgRAAIAAhtIARAAIAAAuIAxAAIAAguIARAAIAABtg");
	this.shape_1.setTransform(69.8,14);

	this.shape_2 = new cjs.Shape();
	this.shape_2.graphics.f("#FFFFFF").s().p("AAZA3IAAgwIgxAAIAAAwIgRAAIAAhtIARAAIAAAuIAxAAIAAguIARAAIAABtg");
	this.shape_2.setTransform(57.7,14);

	this.shape_3 = new cjs.Shape();
	this.shape_3.graphics.f("#FFFFFF").s().p("AgfArQgNgPAAgcQAAgaAMgQQAMgOAVAAQAVAAALANQAMAOAAAaIgBAIIhHAAQABASAJAKQAIAJAOAAQAPAAANgIIAHANQgGAFgKACQgKADgKAAQgWAAgNgOgAgagIIA3AAQgBgQgHgJQgHgIgNgBQgZAAgCAig");
	this.shape_3.setTransform(46.1,14);

	this.shape_4 = new cjs.Shape();
	this.shape_4.graphics.f("#FFFFFF").s().p("AguArQAJgFAFgFQAFgGACgIQACgHABgMIAEg3IBBAAIAABtIgRAAIAAheIghAAIgDApQgBAQgDAJQgCAJgHAHQgGAHgOAHg");
	this.shape_4.setTransform(34,14.1);

	this.shape_5 = new cjs.Shape();
	this.shape_5.graphics.f("#FFFFFF").s().p("AgoA3IAAhtIApAAQAPAAAJAIQAJAIAAAOQAAAHgDAGQgEAGgHADQAKACAFAGQAGAHAAALQAAAOgKAJQgJAIgQAAgAgXApIAdAAQAIAAAFgFQAFgEAAgJQAAgJgFgEQgFgFgJABIgcAAgAgXgHIAYAAQAIAAAFgEQAFgFAAgHQAAgJgFgEQgFgEgJAAIgXAAg");
	this.shape_5.setTransform(23.8,14);

	this.shape_6 = new cjs.Shape();
	this.shape_6.graphics.f("#FFFFFF").s().p("AghArQgMgOAAgdQAAgbAMgPQAMgOAVAAQAWAAAMAOQAMAOAAAcQAAAcgMAPQgMAOgWAAQgVAAgMgOgAgVgeQgGAKgBAUQABAVAGALQAIALANAAQAOAAAIgLQAGgLABgVQgBgUgGgKQgIgMgOAAQgNAAgIAMg");
	this.shape_6.setTransform(12.2,14);

	this.shape_7 = new cjs.Shape();
	this.shape_7.graphics.f("#FFFFFF").s().p("AAnA3IAAhUIggBAIgOAAIgfhAIAABUIgQAAIAAhtIAUAAIAiBHIAjhHIAUAAIAABtg");
	this.shape_7.setTransform(-0.9,14);

	this.shape_8 = new cjs.Shape();
	this.shape_8.graphics.f("#FFFFFF").s().p("AgfAwQgJgIAAgPQAAgUAQgIQAQgKAhAAIAAgHQAAgLgHgFQgGgFgMAAQgNAAgMAFIgFgNQAPgIARABQARAAALAJQALAIAAASIAABMIgPAAIAAgNQgLAPgVAAQgQAAgJgJgAgMAGQgMAFAAAMQAAAKAGAEQAFAGALAAQAHgBAHgDQAHgDAGgHIAAgdQgZAAgMAGg");
	this.shape_8.setTransform(-14.1,14);

	this.shape_9 = new cjs.Shape();
	this.shape_9.graphics.f("#FFFFFF").s().p("AgXA4QgJgCgHgEIAGgNQAGADAHABIAOACQAOAAAHgFQAIgFgBgKQAAgRgZAAIgRAAIAAgNIAQAAQAKAAAGgEQAHgFgBgIQAAgJgGgFQgHgEgKAAQgKAAgOAGIgFgNQAHgDAIgCQAJgDAIAAQAQAAALAIQAKAHABAPQgBASgRAHQALACAFAHQAGAGAAALQAAAQgNAJQgMAJgTAAQgKAAgJgCg");
	this.shape_9.setTransform(-23.9,14);

	this.shape_10 = new cjs.Shape();
	this.shape_10.graphics.f("#FFFFFF").s().p("AArBGIgDgeIhPAAIgDAeIgNAAIAAgsIAIAAQALgHAFgJQAEgJABgPIAFg3IA9AAIAABfIAQAAIAAAsgAgJgMQgCANgDAJQgEAIgIAIIAyAAIAAhRIgdAAg");
	this.shape_10.setTransform(-34.8,15.5);

	this.shape_11 = new cjs.Shape();
	this.shape_11.graphics.f("#FFFFFF").s().p("AgfArQgNgPAAgcQAAgaAMgQQAMgOAVAAQAVAAALANQAMAOAAAaIgBAIIhHAAQABASAJAKQAIAJAOAAQAPAAANgIIAHANQgHAFgJACQgJADgLAAQgWAAgNgOgAgagIIA3AAQgBgQgHgJQgHgIgNgBQgYAAgDAig");
	this.shape_11.setTransform(-46.2,14);

	this.shape_12 = new cjs.Shape();
	this.shape_12.graphics.f("#FFFFFF").s().p("AgrBOIAAiYIAPAAIAAAPQAGgJAIgFQAIgDAJAAQATAAALAPQALAPAAAbQAAAbgLAPQgMAOgUAAQgIAAgHgDQgHgDgFgGIAAA1gAgOg5QgHACgFAIIAAA5QAFAGAHADQAHAEAHAAQANAAAHgLQAHgLAAgTQAAgVgHgLQgHgLgOAAQgHABgGADg");
	this.shape_12.setTransform(-57.3,16);

	this.shape_13 = new cjs.Shape();
	this.shape_13.graphics.f("#FFFFFF").s().p("AgfArQgNgPAAgcQAAgaAMgQQAMgOAVAAQAVAAALANQAMAOAAAaIgBAIIhHAAQABASAJAKQAIAJAOAAQAPAAANgIIAHANQgGAFgKACQgKADgKAAQgWAAgNgOgAgagIIA3AAQgBgQgHgJQgHgIgNgBQgZAAgCAig");
	this.shape_13.setTransform(-69.1,14);

	this.shape_14 = new cjs.Shape();
	this.shape_14.graphics.f("#FFFFFF").s().p("AAZA3IAAheIgyAAIAABeIgQAAIAAhtIBTAAIAABtg");
	this.shape_14.setTransform(-80.7,14);

	this.shape_15 = new cjs.Shape();
	this.shape_15.graphics.f("#FFFFFF").s().p("AAbA3IAAhSIg1BSIgRAAIAAhtIARAAIAABSIA1hSIARAAIAABtg");
	this.shape_15.setTransform(23,-11.1);

	this.shape_16 = new cjs.Shape();
	this.shape_16.graphics.f("#FFFFFF").s().p("AgiA+QgLgQAAgcQAAgYADgRQAEgRAIgMQAIgMAQgFQAPgFAbgDIACAQQgZACgMAEQgMADgGAJQgHAKgCATQANgLARAAQAUAAALAMQALANAAAXQAAASgGAMQgGAMgKAHQgLAGgNAAQgWAAgMgQgAgOgIQgHADgHAFIAAATQAAAsAcAAQANAAAIgKQAIgLAAgTQAAgSgHgHQgHgJgPAAQgHAAgHADg");
	this.shape_16.setTransform(11,-13.2);

	this.shape_17 = new cjs.Shape();
	this.shape_17.graphics.f("#FFFFFF").s().p("AghArQgMgPAAgcQAAgbAMgPQAMgPAVAAQAWAAAMAPQAMAOAAAcQAAAcgMAPQgMAOgWAAQgVAAgMgOgAgVgfQgHALAAAUQAAAVAHALQAIAKANAAQAOAAAIgKQAGgLABgVQgBgUgGgLQgIgLgOABQgNgBgIALg");
	this.shape_17.setTransform(-0.5,-11.1);

	this.shape_18 = new cjs.Shape();
	this.shape_18.graphics.f("#FFFFFF").s().p("AgrBNIAAiXIAPAAIAAAOQAGgIAIgEQAIgFAJAAQATAAALAQQALAPAAAcQAAAagLAOQgMAPgUAAQgIAAgHgCQgHgEgFgGIAAA0gAgOg6QgHAEgFAGIAAA6QAFAGAHADQAHADAHAAQANAAAHgKQAHgKAAgUQAAgVgHgLQgHgLgOAAQgHAAgGADg");
	this.shape_18.setTransform(-11.8,-9.1);

	this.shape_19 = new cjs.Shape();
	this.shape_19.graphics.f("#FFFFFF").s().p("AgxBCIAHgNQARAIATAAQARAAALgIQAKgHAAgPQAAgOgJgGQgKgGgNAAIgYAAIAAgOIAVAAQAPAAAHgGQAIgHAAgNQAAgNgJgGQgJgHgOAAQgPAAgRAIIgGgNQASgKAVAAQAWAAANAKQAOAKAAATQgBAYgVAKQAbAIAAAbQAAAWgPALQgQAMgZAAQgZAAgSgLg");
	this.shape_19.setTransform(-24,-13.1);

	this.timeline.addTween(cjs.Tween.get({}).to({state:[{t:this.shape_19},{t:this.shape_18},{t:this.shape_17},{t:this.shape_16},{t:this.shape_15},{t:this.shape_14},{t:this.shape_13},{t:this.shape_12},{t:this.shape_11},{t:this.shape_10},{t:this.shape_9},{t:this.shape_8},{t:this.shape_7},{t:this.shape_6},{t:this.shape_5},{t:this.shape_4},{t:this.shape_3},{t:this.shape_2},{t:this.shape_1},{t:this.shape}]}).wait(1));

}).prototype = getMCSymbolPrototype(lib.txt2, new cjs.Rectangle(-88.9,-27.1,177.8,54.3), null);


(lib.txt1 = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// Layer 1
	this.shape = new cjs.Shape();
	this.shape.graphics.f("#FFFFFF").s().p("AAZA3IAAgwIgxAAIAAAwIgRAAIAAhtIARAAIAAAuIAxAAIAAguIARAAIAABtg");
	this.shape.setTransform(99,14);

	this.shape_1 = new cjs.Shape();
	this.shape_1.graphics.f("#FFFFFF").s().p("AghArQgMgOAAgdQAAgbAMgPQAMgOAVAAQAWAAAMAOQAMAOAAAcQAAAcgMAPQgMAOgWAAQgVAAgMgOgAgVgeQgHAKAAAUQAAAVAHALQAIALANAAQAOAAAIgLQAGgLABgVQgBgUgGgKQgIgMgOAAQgNAAgIAMg");
	this.shape_1.setTransform(87.2,14);

	this.shape_2 = new cjs.Shape();
	this.shape_2.graphics.f("#FFFFFF").s().p("AgHBhIAAgoQgbgCgPgPQgOgOAAgaQAAgZAOgPQAPgOAbgCIAAgoIAPAAIAAAoQAbABAOAPQAPAPAAAZQAAAagPAPQgOAOgbACIAAAogAAIArQATgCAKgLQAKgLAAgTQAAgSgKgLQgKgLgTgCgAgkgdQgKALAAASQAAATAKALQAKALATACIAAhVQgTACgKALg");
	this.shape_2.setTransform(74.1,14);

	this.shape_3 = new cjs.Shape();
	this.shape_3.graphics.f("#FFFFFF").s().p("AgIA3IAAheIgeAAIAAgPIBNAAIAAAPIgfAAIAABeg");
	this.shape_3.setTransform(62.2,14);

	this.shape_4 = new cjs.Shape();
	this.shape_4.graphics.f("#FFFFFF").s().p("AgrBOIAAiYIAPAAIAAAPQAGgJAIgFQAIgDAJAAQATAAALAPQALAPAAAbQAAAbgLAPQgMAOgUAAQgIAAgHgDQgHgDgFgGIAAA1gAgOg5QgHACgFAIIAAA5QAFAGAHADQAHAEAHAAQANAAAHgLQAHgLAAgTQAAgVgHgLQgHgLgOAAQgHABgGADg");
	this.shape_4.setTransform(52.2,16);

	this.shape_5 = new cjs.Shape();
	this.shape_5.graphics.f("#FFFFFF").s().p("AgfAwQgJgIAAgPQAAgUAQgIQAQgKAhAAIAAgHQAAgLgHgFQgGgFgMAAQgNAAgMAFIgFgNQAPgIARABQARAAALAJQALAIAAASIAABMIgPAAIAAgNQgLAPgVAAQgQAAgJgJgAgMAGQgMAFAAAMQAAAKAGAEQAFAGALAAQAHgBAHgDQAHgDAGgHIAAgdQgZAAgMAGg");
	this.shape_5.setTransform(40,14);

	this.shape_6 = new cjs.Shape();
	this.shape_6.graphics.f("#FFFFFF").s().p("AAnA3IAAhUIggBAIgOAAIgfhAIAABUIgQAAIAAhtIAUAAIAiBHIAjhHIAUAAIAABtg");
	this.shape_6.setTransform(27.8,14);

	this.shape_7 = new cjs.Shape();
	this.shape_7.graphics.f("#FFFFFF").s().p("AgbArQgNgQABgbQAAgQAFgNQAHgNAKgIQALgGANAAQAJAAAIACQAJACAGAFIgGAMQgOgGgMgBQgNAAgIAMQgIAKAAAUQAAAUAIALQAJALAPAAQAMAAAMgHIAHANQgHAEgIADQgIACgJAAQgXAAgNgOg");
	this.shape_7.setTransform(15.6,14);

	this.shape_8 = new cjs.Shape();
	this.shape_8.graphics.f("#FFFFFF").s().p("AAbBOIAAhSIg1BSIgQAAIAAhtIARAAIAABSIA0hSIAQAAIAABtgAgUg3QgJgIgBgOIALAAQACAIAFADQAGAEAIABQATgBADgPIAMAAQgCAOgJAIQgJAHgOAAQgOAAgIgHg");
	this.shape_8.setTransform(-0.3,11.7);

	this.shape_9 = new cjs.Shape();
	this.shape_9.graphics.f("#FFFFFF").s().p("AAbA3IAAhSIg1BSIgRAAIAAhtIASAAIAABSIA0hSIARAAIAABtg");
	this.shape_9.setTransform(-12.7,14);

	this.shape_10 = new cjs.Shape();
	this.shape_10.graphics.f("#FFFFFF").s().p("AAZA3IAAgwIgxAAIAAAwIgRAAIAAhtIARAAIAAAuIAxAAIAAguIARAAIAABtg");
	this.shape_10.setTransform(-25,14);

	this.shape_11 = new cjs.Shape();
	this.shape_11.graphics.f("#FFFFFF").s().p("AA4A3IgggxIgCABIgOAFIAAArIgPAAIAAgrIgOgFIgCgBIggAxIgTAAIAkg3QgIgFgEgGQgGgHgDgJIgIgbIARAAQADARAFAJQADAIAHAFQAGAGALAEIAIADIAAg0IAPAAIAAA0IAIgDQAMgEAFgGQAHgFAEgIQAEgJADgRIARAAIgIAbQgDAJgFAHQgFAGgIAFIAkA3g");
	this.shape_11.setTransform(-39.1,14);

	this.shape_12 = new cjs.Shape();
	this.shape_12.graphics.f("#FFFFFF").s().p("AgfArQgNgPAAgcQAAgaAMgQQAMgOAVAAQAVAAALANQAMAOAAAaIgBAIIhHAAQABASAIAKQAJAJAOAAQAPAAANgIIAHANQgHAFgJACQgJADgKAAQgXAAgNgOgAgbgIIA4AAQgBgQgHgJQgHgIgOgBQgXAAgEAig");
	this.shape_12.setTransform(-52.7,14);

	this.shape_13 = new cjs.Shape();
	this.shape_13.graphics.f("#FFFFFF").s().p("AAnA3IAAhUIggBAIgOAAIgfhAIAABUIgQAAIAAhtIAUAAIAiBHIAjhHIAUAAIAABtg");
	this.shape_13.setTransform(-65.6,14);

	this.shape_14 = new cjs.Shape();
	this.shape_14.graphics.f("#FFFFFF").s().p("AgXA4QgJgCgHgEIAGgNQAGADAHABIAOACQANAAAIgFQAHgFAAgKQABgRgaAAIgRAAIAAgNIAQAAQAKAAAHgEQAFgFABgIQAAgJgHgFQgGgEgKAAQgLAAgPAGIgEgNQAHgDAIgCQAJgDAHAAQARAAAKAIQALAHAAAPQAAASgQAHQAJACAGAHQAGAGAAALQAAAQgMAJQgNAJgTAAQgKAAgJgCg");
	this.shape_14.setTransform(-77.8,14);

	this.shape_15 = new cjs.Shape();
	this.shape_15.graphics.f("#FFFFFF").s().p("AgfArQgNgPAAgcQAAgaAMgQQAMgOAVAAQAVAAAMANQALAOAAAaIgBAIIhHAAQABASAJAKQAIAJAPAAQAPAAANgIIAGANQgHAFgJACQgKADgKAAQgWAAgNgOgAgagIIA2AAQAAgQgHgJQgIgIgNgBQgYAAgCAig");
	this.shape_15.setTransform(-87.8,14);

	this.shape_16 = new cjs.Shape();
	this.shape_16.graphics.f("#FFFFFF").s().p("AgiA+QgLgQAAgcQAAgYADgRQAEgRAIgMQAIgMAQgFQAPgFAbgDIACAQQgZACgMAEQgMADgGAJQgHAKgCATQANgLARAAQAUAAALAMQALANAAAXQAAASgGAMQgGAMgKAHQgLAGgNAAQgWAAgMgQgAgOgIQgHADgHAFIAAATQAAAsAcAAQANAAAIgKQAIgLAAgTQAAgSgHgHQgHgJgPAAQgHAAgHADg");
	this.shape_16.setTransform(-99.1,12);

	this.shape_17 = new cjs.Shape();
	this.shape_17.graphics.f("#FFFFFF").s().p("AAbBOIAAhSIg1BSIgQAAIAAhtIARAAIAABSIA0hSIAQAAIAABtgAgUg3QgIgHgCgPIALAAQACAIAFAEQAGADAIAAQASAAAEgPIALAAQgBAPgJAHQgJAIgOAAQgOAAgIgIg");
	this.shape_17.setTransform(40.1,-13.4);

	this.shape_18 = new cjs.Shape();
	this.shape_18.graphics.f("#FFFFFF").s().p("AgfAwQgJgIAAgQQAAgTAQgJQAQgJAhAAIAAgHQAAgLgHgEQgGgGgMAAQgNAAgMAGIgFgOQAPgIARAAQARABALAIQALAKAAAQIAABNIgPAAIAAgOQgLAQgVAAQgQABgJgKgAgMAFQgMAGAAAMQAAAJAGAGQAFAEALAAQAHABAHgEQAHgDAGgGIAAgeQgZAAgMAFg");
	this.shape_18.setTransform(28,-11.1);

	this.shape_19 = new cjs.Shape();
	this.shape_19.graphics.f("#FFFFFF").s().p("AAYA3IAAgvQgPAGgOAAQgRAAgJgKQgJgIAAgRIAAghIAQAAIAAAdQAAAMAFAHQAFAGANAAQALAAAOgFIAAgxIARAAIAABtg");
	this.shape_19.setTransform(17.1,-11.1);

	this.shape_20 = new cjs.Shape();
	this.shape_20.graphics.f("#FFFFFF").s().p("AgHBMIAAhtIAPAAIAABtgAgHg3QgDgDgBgGQABgFADgDQADgDAEAAQAFAAAEADQACADAAAFQAAAGgCADQgEADgFAAQgEAAgDgDg");
	this.shape_20.setTransform(8.8,-13.2);

	this.shape_21 = new cjs.Shape();
	this.shape_21.graphics.f("#FFFFFF").s().p("AgrBNIAAiXIAPAAIAAAOQAGgIAIgEQAIgFAJAAQATAAALAQQALAPAAAcQAAAagLAOQgMAPgUAAQgIAAgHgCQgHgEgFgGIAAA0gAgOg6QgHAEgFAGIAAA6QAFAGAHADQAHADAHAAQANAAAHgKQAHgKAAgUQAAgVgHgLQgHgLgOAAQgHAAgGADg");
	this.shape_21.setTransform(0.5,-9.1);

	this.shape_22 = new cjs.Shape();
	this.shape_22.graphics.f("#FFFFFF").s().p("AgIA3IAAhfIgeAAIAAgOIBNAAIAAAOIgfAAIAABfg");
	this.shape_22.setTransform(-10.3,-11.1);

	this.shape_23 = new cjs.Shape();
	this.shape_23.graphics.f("#FFFFFF").s().p("AgbAqQgMgPAAgbQAAgQAFgNQAGgNALgIQAMgHAMAAQAJABAIACQAJACAGAEIgGAOQgOgIgMABQgNgBgIALQgIAMAAASQAAAVAIALQAJALAPAAQANAAALgHIAHANQgHAFgIACQgIACgJAAQgXAAgNgPg");
	this.shape_23.setTransform(-19.6,-11.1);

	this.shape_24 = new cjs.Shape();
	this.shape_24.graphics.f("#FFFFFF").s().p("AgtA/QAPgFAJgIQAJgGAFgLIgnhuIASAAIAcBaIAehaIARAAIgmBuQgKAfgmANg");
	this.shape_24.setTransform(-29.9,-8.9);

	this.shape_25 = new cjs.Shape();
	this.shape_25.graphics.f("#FFFFFF").s().p("AgxBCIAHgNQARAIATAAQARAAALgIQAKgHAAgPQAAgOgJgGQgKgGgNAAIgYAAIAAgOIAWAAQAOAAAHgGQAHgHABgNQAAgNgJgGQgJgHgOAAQgOAAgSAIIgGgNQASgKAVAAQAWAAANAKQAOAKAAATQAAAYgWAKQAbAIAAAbQAAAWgPALQgQAMgZAAQgaAAgRgLg");
	this.shape_25.setTransform(-41,-13.1);

	this.timeline.addTween(cjs.Tween.get({}).to({state:[{t:this.shape_25},{t:this.shape_24},{t:this.shape_23},{t:this.shape_22},{t:this.shape_21},{t:this.shape_20},{t:this.shape_19},{t:this.shape_18},{t:this.shape_17},{t:this.shape_16},{t:this.shape_15},{t:this.shape_14},{t:this.shape_13},{t:this.shape_12},{t:this.shape_11},{t:this.shape_10},{t:this.shape_9},{t:this.shape_8},{t:this.shape_7},{t:this.shape_6},{t:this.shape_5},{t:this.shape_4},{t:this.shape_3},{t:this.shape_2},{t:this.shape_1},{t:this.shape}]}).wait(1));

}).prototype = getMCSymbolPrototype(lib.txt1, new cjs.Rectangle(-107.1,-27.1,214.2,54.3), null);


(lib.Tween1 = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// Layer 1
	this.instance = new lib.astronaut_970();
	this.instance.parent = this;
	this.instance.setTransform(-51,-67);

	this.timeline.addTween(cjs.Tween.get(this.instance).wait(1));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(-51,-67,102,134);


(lib.samsung = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// timeline functions:
	this.frame_0 = function() {
		this.stop();
	}
	this.frame_12 = function() {
		this.stop();
	}

	// actions tween:
	this.timeline.addTween(cjs.Tween.get(this).call(this.frame_0).wait(12).call(this.frame_12).wait(1));

	// Layer 3 (mask)
	var mask = new cjs.Shape();
	mask._off = true;
	var mask_graphics_1 = new cjs.Graphics().p("AqOCMIC0kXIRpAAIi0EXg");
	var mask_graphics_2 = new cjs.Graphics().p("AqlCMIC7kXISQAAIi7EXg");
	var mask_graphics_3 = new cjs.Graphics().p("Aq6CMIDAkXIS0AAIjAEXg");
	var mask_graphics_4 = new cjs.Graphics().p("ArMCMIDGkXITTAAIjGEXg");
	var mask_graphics_5 = new cjs.Graphics().p("ArcCMIDKkXITvAAIjKEXg");
	var mask_graphics_6 = new cjs.Graphics().p("ArrCMIDPkXIUHAAIjOEXg");
	var mask_graphics_7 = new cjs.Graphics().p("Ar2CMIDRkXIUcAAIjREXg");
	var mask_graphics_8 = new cjs.Graphics().p("AsACMIDUkXIUtAAIjUEXg");
	var mask_graphics_9 = new cjs.Graphics().p("AsHCMIDVkXIU6AAIjWEXg");
	var mask_graphics_10 = new cjs.Graphics().p("AsNCMIDXkXIVEAAIjYEXg");
	var mask_graphics_11 = new cjs.Graphics().p("AsQCMIDYkXIVJAAIjYEXg");
	var mask_graphics_12 = new cjs.Graphics().p("AsRCMIDYkXIVLAAIjYEXg");

	this.timeline.addTween(cjs.Tween.get(mask).to({graphics:null,x:0,y:0}).wait(1).to({graphics:mask_graphics_1,x:-106.5,y:-1}).wait(1).to({graphics:mask_graphics_2,x:-87.4,y:-1}).wait(1).to({graphics:mask_graphics_3,x:-70.1,y:-1}).wait(1).to({graphics:mask_graphics_4,x:-54.6,y:-1}).wait(1).to({graphics:mask_graphics_5,x:-41,y:-1}).wait(1).to({graphics:mask_graphics_6,x:-29.2,y:-1}).wait(1).to({graphics:mask_graphics_7,x:-19.2,y:-1}).wait(1).to({graphics:mask_graphics_8,x:-11,y:-1}).wait(1).to({graphics:mask_graphics_9,x:-4.6,y:-1}).wait(1).to({graphics:mask_graphics_10,x:-0.1,y:-1}).wait(1).to({graphics:mask_graphics_11,x:2.6,y:-1}).wait(1).to({graphics:mask_graphics_12,x:3.5,y:-1}).wait(1));

	// Layer 2
	this.instance = new lib.samsung_970_bl();
	this.instance.parent = this;
	this.instance.setTransform(-43,-3);
	this.instance._off = true;

	var maskedShapeInstanceList = [this.instance];

	for(var shapedInstanceItr = 0; shapedInstanceItr < maskedShapeInstanceList.length; shapedInstanceItr++) {
		maskedShapeInstanceList[shapedInstanceItr].mask = mask;
	}

	this.timeline.addTween(cjs.Tween.get(this.instance).wait(1).to({_off:false},0).wait(12));

	// Layer 1
	this.instance_1 = new lib.samsung_final_970();
	this.instance_1.parent = this;
	this.instance_1.setTransform(-44,-4,0.68,0.68);

	this.timeline.addTween(cjs.Tween.get(this.instance_1).wait(13));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(-44,-4,105.4,15.7);


(lib.product3_1 = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// Layer 1
	this.instance = new lib.product3();
	this.instance.parent = this;
	this.instance.setTransform(-70,-84);

	this.timeline.addTween(cjs.Tween.get(this.instance).wait(1));

}).prototype = getMCSymbolPrototype(lib.product3_1, new cjs.Rectangle(-70,-84,139,168), null);


(lib.product1_1 = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// Layer 1
	this.instance = new lib.product1();
	this.instance.parent = this;
	this.instance.setTransform(-60,-129);

	this.timeline.addTween(cjs.Tween.get(this.instance).wait(1));

}).prototype = getMCSymbolPrototype(lib.product1_1, new cjs.Rectangle(-60,-129,120,257), null);


(lib.phone_top_1 = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// Layer 1
	this.instance = new lib.phone_top();
	this.instance.parent = this;
	this.instance.setTransform(-91.5,-21);

	this.timeline.addTween(cjs.Tween.get(this.instance).wait(1));

}).prototype = getMCSymbolPrototype(lib.phone_top_1, new cjs.Rectangle(-91.5,-21,183,42), null);


(lib.phone_right_1 = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// Layer 1
	this.instance = new lib.phone_right();
	this.instance.parent = this;
	this.instance.setTransform(-8.5,-145.5);

	this.timeline.addTween(cjs.Tween.get(this.instance).wait(1));

}).prototype = getMCSymbolPrototype(lib.phone_right_1, new cjs.Rectangle(-8.5,-145.5,17,291), null);


(lib.phone_left_1 = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// Layer 1
	this.instance = new lib.phone_left();
	this.instance.parent = this;
	this.instance.setTransform(-8.5,-145.5);

	this.timeline.addTween(cjs.Tween.get(this.instance).wait(1));

}).prototype = getMCSymbolPrototype(lib.phone_left_1, new cjs.Rectangle(-8.5,-145.5,17,291), null);


(lib.phone_bottom_1 = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// Layer 1
	this.instance = new lib.phone_bottom();
	this.instance.parent = this;
	this.instance.setTransform(-91.5,-28);

	this.timeline.addTween(cjs.Tween.get(this.instance).wait(1));

}).prototype = getMCSymbolPrototype(lib.phone_bottom_1, new cjs.Rectangle(-91.5,-28,183,56), null);


(lib.logo2_2 = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// Layer 1
	this.instance = new lib.samsung_final_970();
	this.instance.parent = this;
	this.instance.setTransform(-62,-9,0.8,0.8);

	this.timeline.addTween(cjs.Tween.get(this.instance).wait(1));

}).prototype = getMCSymbolPrototype(lib.logo2_2, new cjs.Rectangle(-62,-9,124,18.4), null);


(lib.legal = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// Layer 1
	this.instance = new lib.legal_97090();
	this.instance.parent = this;
	this.instance.setTransform(-104,-24);

	this.timeline.addTween(cjs.Tween.get(this.instance).wait(1));

}).prototype = getMCSymbolPrototype(lib.legal, new cjs.Rectangle(-104,-24,208,47), null);


(lib.galaxy_es = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// Layer 1
	this.shape = new cjs.Shape();
	this.shape.graphics.f("#FFFFFF").s().p("AgLAiQgFgCgDgEQgDgFAAgFQgBgGAFgGQAEgFAHgCQgGgCgDgEQgDgFAAgGQgBgFADgEQADgEAEgDQAFgCAFAAQAGAAAEACQAFADADAEQACAEAAAFQAAAGgDAFQgEAEgFACQAHABAEAFQAEAFABAHQAAAGgEAEQgDAFgEACQgGADgHAAQgGAAgFgDgAgKAIQgEAEAAAFQAAAGAEADQAEADAGAAQAHAAAEgDQAEgDAAgGQAAgFgEgEQgEgEgHgDQgGADgEAEgAgIgaQgDADAAAGQAAAEADAEQAEADAEACQAGgBADgEQADgEAAgEQAAgGgDgDQgEgDgFAAQgFAAgDADg");
	this.shape.setTransform(24.5,-0.2);

	this.shape_1 = new cjs.Shape();
	this.shape_1.graphics.f("#FFFFFF").s().p("AgMAUQgGgHAAgNQAAgHACgGQADgHAFgDQAGgDAFAAIAIABIAHADIgDAGQgGgDgGAAQgGAAgDAFQgEAFAAAJQAAAKAEAFQAEAFAHAAQAGAAAFgDIADAGIgHADIgIABQgKAAgGgHg");
	this.shape_1.setTransform(17.1,0.7);

	this.shape_2 = new cjs.Shape();
	this.shape_2.graphics.f("#FFFFFF").s().p("AgUAjIAAhFIAoAAIAAAHIggAAIAAAXIAYAAIAAAHIgYAAIAAAZIAhAAIAAAHg");
	this.shape_2.setTransform(12.2,-0.2);

	this.shape_3 = new cjs.Shape();
	this.shape_3.graphics.f("#FFFFFF").s().p("AgDAkIAAgzIAHAAIAAAzgAgDgaQAAAAgBgBQAAAAAAAAQAAgBAAgBQgBAAAAgBQAAAAABgBQAAgBAAAAQAAAAAAgBQABAAAAgBQAAAAABAAQAAgBABAAQAAAAABAAQAAAAAAAAQABAAAAAAQABAAAAAAQABAAAAABQABAAAAAAQAAABABAAQAAABAAAAQAAAAAAABQAAABAAAAQAAABAAAAQAAABAAABQAAAAAAAAQgBABAAAAQAAABgBAAQAAAAgBAAQAAABgBAAQAAAAgBAAQAAAAAAAAQgBAAAAgBQgBAAAAAAQgBAAAAgBg");
	this.shape_3.setTransform(5.6,-0.3);

	this.shape_4 = new cjs.Shape();
	this.shape_4.graphics.f("#FFFFFF").s().p("AgMAUQgGgHAAgNQAAgHACgGQADgHAFgDQAGgDAFAAIAIABIAHADIgDAGQgGgDgGAAQgGAAgDAFQgEAFAAAJQAAAKAEAFQAEAFAHAAQAGAAAFgDIADAGIgHADIgIABQgKAAgGgHg");
	this.shape_4.setTransform(2,0.7);

	this.shape_5 = new cjs.Shape();
	this.shape_5.graphics.f("#FFFFFF").s().p("AAMAaIgPgXIgCABIgHADIAAATIgIAAIAAgzIAIAAIAAAZIAEgCIAIgFQADgCACgEQADgFABgHIAIAAQgCALgDAFQgEAFgFAEIASAag");
	this.shape_5.setTransform(-2.8,0.7);

	this.shape_6 = new cjs.Shape();
	this.shape_6.graphics.f("#FFFFFF").s().p("AgOAUQgHgHAAgNQABgMAFgHQAGgHAKAAQAKAAAFAGQAFAHAAAMIAAADIgiAAQABAJAEAFQAEAEAGAAQAIAAAGgEIADAGQgDADgFABIgJABQgKAAgGgHgAgMgDIAZAAQABgIgEgEQgDgEgHAAQgLAAgBAQg");
	this.shape_6.setTransform(-8.3,0.7);

	this.shape_7 = new cjs.Shape();
	this.shape_7.graphics.f("#FFFFFF").s().p("AgVAUQAEgCACgDQADgCABgEIABgJIACgaIAeAAIAAA0IgIAAIAAgtIgPAAIgBAUIgCALQgBAFgEADQgDADgGAEg");
	this.shape_7.setTransform(-14.1,0.7);

	this.shape_8 = new cjs.Shape();
	this.shape_8.graphics.f("#FFFFFF").s().p("AgOAUQgGgHAAgNQAAgMAFgHQAGgHAJAAQALAAAFAGQAGAHAAAMIgBADIghAAQAAAJAEAFQAEAEAGAAQAIAAAGgEIADAGQgDADgFABIgJABQgKAAgGgHgAgMgDIAaAAQAAgIgEgEQgDgEgHAAQgLAAgBAQg");
	this.shape_8.setTransform(-19.2,0.7);

	this.shape_9 = new cjs.Shape();
	this.shape_9.graphics.f("#FFFFFF").s().p("AgTArIAAhGIAfAAIACgPIAFAAIAAAWIgeAAIAAA/g");
	this.shape_9.setTransform(-24,-1);

	this.timeline.addTween(cjs.Tween.get({}).to({state:[{t:this.shape_9},{t:this.shape_8},{t:this.shape_7},{t:this.shape_6},{t:this.shape_5},{t:this.shape_4},{t:this.shape_3},{t:this.shape_2},{t:this.shape_1},{t:this.shape}]}).wait(1));

}).prototype = getMCSymbolPrototype(lib.galaxy_es, new cjs.Rectangle(-29,-8,58.4,16), null);


(lib.galaxy = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// timeline functions:
	this.frame_0 = function() {
		this.stop();
	}
	this.frame_9 = function() {
		this.stop();
	}

	// actions tween:
	this.timeline.addTween(cjs.Tween.get(this).call(this.frame_0).wait(9).call(this.frame_9).wait(1));

	// Layer 3 (mask)
	var mask = new cjs.Shape();
	mask._off = true;
	var mask_graphics_1 = new cjs.Graphics().p("AumCqIDwlTIZdAAIjwFTg");
	var mask_graphics_2 = new cjs.Graphics().p("Au8CqID2lTIaDAAIj2FTg");
	var mask_graphics_3 = new cjs.Graphics().p("AvPCqID7lTIakAAIj7FTg");
	var mask_graphics_4 = new cjs.Graphics().p("AvfCqID+lTIbBAAIj/FTg");
	var mask_graphics_5 = new cjs.Graphics().p("AvsCqIEClTIbXAAIkCFTg");
	var mask_graphics_6 = new cjs.Graphics().p("Av2CqIEElTIbpAAIkFFTg");
	var mask_graphics_7 = new cjs.Graphics().p("Av+CqIEHlTIb2AAIkHFTg");
	var mask_graphics_8 = new cjs.Graphics().p("AwCCqIEIlTIb9AAIkIFTg");
	var mask_graphics_9 = new cjs.Graphics().p("AwDCqIEIlTIb/AAIkIFTg");

	this.timeline.addTween(cjs.Tween.get(mask).to({graphics:null,x:0,y:0}).wait(1).to({graphics:mask_graphics_1,x:-179.5,y:1}).wait(1).to({graphics:mask_graphics_2,x:-139.6,y:1}).wait(1).to({graphics:mask_graphics_3,x:-105.1,y:1}).wait(1).to({graphics:mask_graphics_4,x:-75.9,y:1}).wait(1).to({graphics:mask_graphics_5,x:-52,y:1}).wait(1).to({graphics:mask_graphics_6,x:-33.4,y:1}).wait(1).to({graphics:mask_graphics_7,x:-20.1,y:1}).wait(1).to({graphics:mask_graphics_8,x:-12.1,y:1}).wait(1).to({graphics:mask_graphics_9,x:-9.5,y:1}).wait(1));

	// Layer 2
	this.instance = new lib.gal_s8_970_bl();
	this.instance.parent = this;
	this.instance.setTransform(-89,-6);
	this.instance._off = true;

	var maskedShapeInstanceList = [this.instance];

	for(var shapedInstanceItr = 0; shapedInstanceItr < maskedShapeInstanceList.length; shapedInstanceItr++) {
		maskedShapeInstanceList[shapedInstanceItr].mask = mask;
	}

	this.timeline.addTween(cjs.Tween.get(this.instance).wait(1).to({_off:false},0).wait(9));

	// Layer 1
	this.instance_1 = new lib.gal_s8_970();
	this.instance_1.parent = this;
	this.instance_1.setTransform(-89,-6);

	this.timeline.addTween(cjs.Tween.get(this.instance_1).wait(10));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(-89,-6,152,20);


(lib.btn = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// Layer 1
	this.shape = new cjs.Shape();
	this.shape.graphics.f("#000000").s().p("AgYA4QgJgCgHgEIAHgQQANAGAOAAQAMAAAHgEQAIgFAAgJQAAgJgHgDQgHgEgKAAIgSAAIAAgOIARAAQAJAAAGgEQAGgEAAgIQAAgIgGgEQgHgEgJAAQgLAAgOAGIgGgQQAHgDAJgCIASgCQAQAAAMAHQALAIAAAPQAAAJgFAGQgEAGgIAEQAVAFAAAUQAAARgNAJQgMAJgUAAQgKAAgKgCg");
	this.shape.setTransform(70.2,1.4);

	this.shape_1 = new cjs.Shape();
	this.shape_1.graphics.f("#000000").s().p("AghAxQgJgJAAgQQAAgTAQgJQAQgJAhAAIAAgGQAAgKgGgFQgGgFgLAAQgNAAgNAGIgFgQQAQgIARAAQATAAALAJQALAJAAASIAABMIgTAAIAAgOQgKARgWAAQgQAAgJgJgAgLAGQgLAGAAALQAAARATAAQAHAAAHgDQAGgDAGgGIAAgcQgXABgLAFg");
	this.shape_1.setTransform(59.7,1.4);

	this.shape_2 = new cjs.Shape();
	this.shape_2.graphics.f("#000000").s().p("AgsBOIAAiYIASAAIAAAOQALgRATAAQAUAAAKAQQALAPAAAbQAAAbgLAPQgLAPgUAAQgIAAgHgDQgHgDgFgGIAAA0gAgNg3QgGADgFAGIAAA3QAEAFAHADQAGADAHAAQAZAAAAgmQAAgogZAAQgHAAgGADg");
	this.shape_2.setTransform(49.2,3.4);

	this.shape_3 = new cjs.Shape();
	this.shape_3.graphics.f("#000000").s().p("AghAxQgJgJAAgQQAAgTAQgJQAQgJAhAAIAAgGQAAgKgGgFQgGgFgLAAQgNAAgNAGIgFgQQAQgIARAAQATAAALAJQALAJAAASIAABMIgTAAIAAgOQgKARgWAAQgQAAgJgJgAgLAGQgLAGAAALQAAARATAAQAHAAAHgDQAGgDAGgGIAAgcQgXABgLAFg");
	this.shape_3.setTransform(37.1,1.4);

	this.shape_4 = new cjs.Shape();
	this.shape_4.graphics.f("#000000").s().p("AgYA4QgJgCgHgEIAHgQQANAGAOAAQAMAAAHgEQAIgFAAgJQAAgJgHgDQgHgEgKAAIgSAAIAAgOIARAAQAJAAAGgEQAGgEAAgIQAAgIgGgEQgHgEgJAAQgLAAgOAGIgGgQQAHgDAJgCIASgCQAQAAAMAHQALAIAAAPQAAAJgFAGQgEAGgIAEQAVAFAAAUQAAARgNAJQgMAJgUAAQgKAAgKgCg");
	this.shape_4.setTransform(27.1,1.4);

	this.shape_5 = new cjs.Shape();
	this.shape_5.graphics.f("#000000").s().p("AAZA3IAAhNIgyBNIgTAAIAAhtIAUAAIAABNIAyhNIATAAIAABtg");
	this.shape_5.setTransform(11.9,1.4);

	this.shape_6 = new cjs.Shape();
	this.shape_6.graphics.f("#000000").s().p("AgJA3IAAhcIgeAAIAAgRIBQAAIAAARIgfAAIAABcg");
	this.shape_6.setTransform(1.1,1.4);

	this.shape_7 = new cjs.Shape();
	this.shape_7.graphics.f("#000000").s().p("AAZA3IAAhNIgyBNIgTAAIAAhtIAUAAIAABNIAyhNIATAAIAABtg");
	this.shape_7.setTransform(-9.6,1.4);

	this.shape_8 = new cjs.Shape();
	this.shape_8.graphics.f("#000000").s().p("AgpA3IAAhtIAqAAQAQAAAKAIQAJAIAAAOQAAAPgQAGQALADAGAGQAFAGAAALQAAAPgKAJQgJAIgRAAgAgWAnIAbAAQAIAAAFgEQADgFAAgIQABgHgFgFQgEgEgJAAIgaAAgAgWgIIAWAAQAIAAAEgEQAFgEAAgHQAAgHgFgEQgFgEgHAAIgWAAg");
	this.shape_8.setTransform(-20.8,1.4);

	this.shape_9 = new cjs.Shape();
	this.shape_9.graphics.f("#000000").s().p("AgiArQgMgPAAgcQAAgbAMgPQAMgPAWAAQAXAAAMAPQAMAPAAAbQAAAcgMAPQgMAPgXAAQgWAAgMgPgAgTgdQgGAKAAATQAAAUAGAKQAHAKAMAAQANAAAHgKQAGgKAAgUQAAgTgGgKQgHgKgNAAQgMAAgHAKg");
	this.shape_9.setTransform(-32.5,1.4);

	this.shape_10 = new cjs.Shape();
	this.shape_10.graphics.f("#000000").s().p("AAlA3IAAhQIgdA9IgQAAIgdg9IAABQIgSAAIAAhtIAXAAIAgBFIAhhFIAXAAIAABtg");
	this.shape_10.setTransform(-45.6,1.4);

	this.shape_11 = new cjs.Shape();
	this.shape_11.graphics.f("#000000").s().p("AghAxQgJgJAAgQQAAgTAQgJQAQgJAhAAIAAgGQAAgKgGgFQgGgFgLAAQgNAAgNAGIgFgQQAQgIARAAQATAAALAJQALAJAAASIAABMIgTAAIAAgOQgKARgWAAQgQAAgJgJgAgLAGQgLAGAAALQAAARATAAQAHAAAHgDQAGgDAGgGIAAgcQgXABgLAFg");
	this.shape_11.setTransform(-58.8,1.4);

	this.shape_12 = new cjs.Shape();
	this.shape_12.graphics.f("#000000").s().p("AgzBCIAIgQQARAIATAAQARAAAKgHQAKgHAAgNQABgYggAAIgZAAIAAgRIAYAAQAMAAAIgGQAHgHAAgLQAAgMgIgGQgJgGgNAAQgQAAgRAIIgHgQQATgKAWAAQAWAAAOAKQANAKAAAUQABAXgWAKQAcAHAAAbQAAAXgQALQgRAMgZAAQgaAAgTgLg");
	this.shape_12.setTransform(-69.8,-0.5);

	this.shape_13 = new cjs.Shape();
	this.shape_13.graphics.f("#FFFFFF").s().p("ArzD3QhngBhIhHQhIhIAAhnQAAhmBIhIQBIhIBnAAIXnAAQBnAABIBIQBHBIABBmQgBBnhHBIQhIBHhnABg");

	this.timeline.addTween(cjs.Tween.get({}).to({state:[{t:this.shape_13},{t:this.shape_12},{t:this.shape_11},{t:this.shape_10},{t:this.shape_9},{t:this.shape_8},{t:this.shape_7},{t:this.shape_6},{t:this.shape_5},{t:this.shape_4},{t:this.shape_3},{t:this.shape_2},{t:this.shape_1},{t:this.shape}]}).wait(1));

}).prototype = getMCSymbolPrototype(lib.btn, new cjs.Rectangle(-100.2,-24.6,200.5,49.3), null);


(lib.black = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// Layer 1
	this.shape = new cjs.Shape();
	this.shape.graphics.f("#000000").s().p("EgcWBexQgUAAAAgUMAAAinBQAAgUAUAAMA4tgV4UAAIAAAAAHBenUAADAvSAACAvUQAAAUgUAAg");
	this.shape.setTransform(183.5,606.5);

	this.timeline.addTween(cjs.Tween.get(this.shape).wait(1));

}).prototype = getMCSymbolPrototype(lib.black, new cjs.Rectangle(0,0,367,1213), null);


(lib.astronaut = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// timeline functions:
	this.frame_0 = function() {
		this.stop();
	}
	this.frame_58 = function() {
		this.gotoAndPlay(1);
	}

	// actions tween:
	this.timeline.addTween(cjs.Tween.get(this).call(this.frame_0).wait(58).call(this.frame_58).wait(1));

	// Layer 1
	this.instance = new lib.Tween1("synched",0);
	this.instance.parent = this;

	this.timeline.addTween(cjs.Tween.get(this.instance).to({y:-8},25).to({y:0},33).wait(1));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(-51,-67,102,134);


(lib.phone_back2 = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// Layer 2
	this.astronaut = new lib.astronaut();
	this.astronaut.parent = this;
	this.astronaut.setTransform(-4.1,-35.1,1.6,1.6,0,0,0,-0.8,-0.8);

	this.timeline.addTween(cjs.Tween.get(this.astronaut).wait(1));

	// Layer 4 (mask)
	var mask = new cjs.Shape();
	mask._off = true;
	mask.graphics.p("Ar2XyMAAAgvjIXtAAMAAAAvjg");

	// Layer 3
	this.instance = new lib.back_970();
	this.instance.parent = this;
	this.instance.setTransform(-840,-156,1.2,1.2);

	var maskedShapeInstanceList = [this.instance];

	for(var shapedInstanceItr = 0; shapedInstanceItr < maskedShapeInstanceList.length; shapedInstanceItr++) {
		maskedShapeInstanceList[shapedInstanceItr].mask = mask;
	}

	this.timeline.addTween(cjs.Tween.get(this.instance).wait(1));

}).prototype = getMCSymbolPrototype(lib.phone_back2, new cjs.Rectangle(-84.4,-152.2,163.2,304.4), null);


(lib.phone_1 = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// Layer 2
	this.right = new lib.phone_right_1();
	this.right.parent = this;
	this.right.setTransform(84,-4.5);

	this.bottom = new lib.phone_bottom_1();
	this.bottom.parent = this;
	this.bottom.setTransform(0,164);

	this.left = new lib.phone_left_1();
	this.left.parent = this;
	this.left.setTransform(-84,-5.5);

	this.top = new lib.phone_top_1();
	this.top.parent = this;
	this.top.setTransform(0,-171);

	this.timeline.addTween(cjs.Tween.get({}).to({state:[{t:this.top},{t:this.left},{t:this.bottom},{t:this.right}]}).wait(1));

	// Layer 1
	this.instance = new lib.phone();
	this.instance.parent = this;
	this.instance.setTransform(-87.5,-192);

	this.timeline.addTween(cjs.Tween.get(this.instance).wait(1));

	// Layer 3
	this.back2 = new lib.phone_back2();
	this.back2.parent = this;
	this.back2.setTransform(1.5,-0.4,1.14,1.14);
	this.back2.alpha = 0;

	this.timeline.addTween(cjs.Tween.get(this.back2).wait(1));

}).prototype = getMCSymbolPrototype(lib.phone_1, new cjs.Rectangle(-956.1,-192,1374.9,384), null);


(lib.back = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// Layer 2
	this.astronaut = new lib.astronaut();
	this.astronaut.parent = this;
	this.astronaut.setTransform(137.2,-18,0.65,0.65,0,0,0,0.3,-0.1);

	this.timeline.addTween(cjs.Tween.get(this.astronaut).wait(1));

	// Layer 1
	this.instance = new lib.back_970();
	this.instance.parent = this;
	this.instance.setTransform(-503,-130);

	this.timeline.addTween(cjs.Tween.get(this.instance).wait(1));

}).prototype = getMCSymbolPrototype(lib.back, new cjs.Rectangle(-503,-130,1005,259), null);


// stage content:
(lib._728x90 = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// timeline functions:
	this.frame_0 = function() {
		var _this = this;
		_this.back.astronaut.rotation = -20;
		createjs.Tween.get(_this.back.astronaut).to({x:160, rotation:0}, 10000, createjs.Ease.linear);
		//createjs.Tween.get(_this.back).to({scaleX:.97, scaleY:.97}, 10000, createjs.Ease.linear);
		function slide2() {
			createjs.Tween.get(_this.phone.left).to({x:_this.phone.left.x - 25}, 1000, createjs.Ease.quartInOut);
			createjs.Tween.get(_this.phone.right).to({x:_this.phone.right.x + 25}, 1000, createjs.Ease.quartInOut);
			createjs.Tween.get(_this.phone.top).to({y:_this.phone.top.y - 50}, 1000, createjs.Ease.quartInOut);
			createjs.Tween.get(_this.phone.bottom).to({y:_this.phone.bottom.y + 60}, 1000, createjs.Ease.quartInOut);
			createjs.Tween.get(_this.back.mask).to({scaleX:50, scaleY:3}, 1000, createjs.Ease.quartInOut);
			createjs.Tween.get(_this).wait(2000).call(slide3);
		}
		createjs.Tween.get(_this).wait(1000).call(slide2);
		function slide3() {
			createjs.Tween.get(_this.phone.left).to({x:_this.phone.left.x - 50, alpha:0, visible:false}, 1000, createjs.Ease.quartInOut);
			createjs.Tween.get(_this.phone.right).to({x:_this.phone.right.x + 50, alpha:0, visible:false}, 1000, createjs.Ease.quartInOut);
			createjs.Tween.get(_this.phone.top).to({y:_this.phone.top.y - 150, alpha:0, visible:false}, 1000, createjs.Ease.quartInOut);
			createjs.Tween.get(_this.phone.bottom).to({y:_this.phone.bottom.y + 60, alpha:0, visible:false}, 1000, createjs.Ease.quartInOut);
			createjs.Tween.get(_this.white).to({alpha:0, visible:false}, 1000, createjs.Ease.quartInOut);
			_this.txt1.visible = true;
			_this.txt1.alpha = 0;
			_this.txt1.y += 50;
			createjs.Tween.get(_this.txt1).wait(300).to({y:_this.txt1.y - 50, alpha:1}, 1000, createjs.Ease.quartOut);
			_this.samsung.visible = true;
			_this.samsung.alpha = 0;
			_this.samsung.x += 30;
			createjs.Tween.get(_this.samsung).wait(600).to({x:_this.samsung.x - 30, alpha:1}, 1000, createjs.Ease.quartOut);
			_this.galaxy.visible = true;
			_this.galaxy.alpha = 0;
			_this.galaxy.x -= 30;
			createjs.Tween.get(_this.galaxy).wait(600).to({x:_this.galaxy.x + 30, alpha:1}, 1000, createjs.Ease.quartOut);
			createjs.Tween.get(_this.galaxy_es).wait(600).to({alpha:1}, 1000, createjs.Ease.quartOut);
			createjs.Tween.get(_this).wait(2000).call(slide4);
		}
		function slide4() {
			createjs.Tween.get(_this.txt1).wait(0).to({y:_this.txt1.y - 20, alpha:0, visible:false}, 500, createjs.Ease.quartIn);
			_this.txt2.visible = true;
			_this.txt2.alpha = 0;
			_this.txt2.y += 50;
			createjs.Tween.get(_this.txt2).wait(300).to({y:_this.txt2.y - 50, alpha:1}, 1000, createjs.Ease.quartOut);
			createjs.Tween.get(_this).wait(2000).call(slide5);
		}
		function slide5() {
			//createjs.Tween.get(_this.phone).wait(0).to({x:176, y:388, scaleX:.75, scaleY:.75}, 1500, createjs.Ease.quartInOut);
			createjs.Tween.get(_this.back).wait(0).to({alpha:0, visible:false}, 1000, createjs.Ease.quartInOut);
			createjs.Tween.get(_this.phone.back2).wait(500).to({alpha:1}, 1000, createjs.Ease.quartOut);
			_this.phone.back2.astronaut.y += 30;
			createjs.Tween.get(_this.phone.back2.astronaut).wait(500).call(_this.phone.back2.astronaut.play).to({y:_this.phone.back2.astronaut.y - 30}, 1000, createjs.Ease.quartOut);
			createjs.Tween.get(_this.txt2).wait(0).to({y:_this.txt2.y - 20, alpha:0, visible:false}, 500, createjs.Ease.quartIn);
			_this.txt3.visible = true;
			_this.txt3.alpha = 0;
			_this.txt3.y += 50;
			createjs.Tween.get(_this.txt3).wait(800).to({y:_this.txt3.y - 50, alpha:1}, 1000, createjs.Ease.quartOut);
			_this.product1.visible = true;
			_this.product1.alpha = 0;
			_this.product1.x += 50;
			createjs.Tween.get(_this.product1).wait(1000).to({x:_this.product1.x - 50, alpha:1}, 1000, createjs.Ease.quartOut);
			_this.product3.visible = true;
			_this.product3.alpha = 0;
			_this.product3.x -= 50;
			createjs.Tween.get(_this.product3).wait(1000).to({x:_this.product3.x + 50, alpha:1}, 1000, createjs.Ease.quartOut);
			createjs.Tween.get(_this.samsung).wait(300).call(_this.samsung.gotoAndPlay, [1]);
			createjs.Tween.get(_this.galaxy).wait(500).call(_this.galaxy.gotoAndPlay, [1]);
			createjs.Tween.get(_this).wait(3000).call(slide6);
		}
		function slide6() {
			_this.black.visible = true;
			createjs.Tween.get(_this.black).to({x:880, alpha:1}, 1000, createjs.Ease.quartInOut);
			_this.logo.visible = true;
			_this.logo.alpha = 0;	
			_this.logo.scaleX = _this.logo.scaleY = 1.5;
			createjs.Tween.get(_this.logo).wait(600).to({scaleX:1, scaleY:1, alpha:1}, 1000, createjs.Ease.quartOut);
			_this.btn.visible = true;
			_this.btn.alpha = 0;
			_this.btn.scaleX = _this.btn.scaleY = 1.5;
			createjs.Tween.get(_this.btn).wait(800).to({scaleX:.8, scaleY:.8, alpha:1}, 1500, createjs.Ease.elasticOut);
			_this.legal.visible = true;
			_this.legal.alpha = 0;
			createjs.Tween.get(_this.legal).wait(1000).to({alpha:1}, 1000, createjs.Ease.quartOut);
		}
	}

	// actions tween:
	this.timeline.addTween(cjs.Tween.get(this).call(this.frame_0).wait(1));

	// final
	this.legal = new lib.legal();
	this.legal.parent = this;
	this.legal.setTransform(609,48);
	this.legal.visible = false;

	this.btn = new lib.btn();
	this.btn.parent = this;
	this.btn.setTransform(344,45,0.8,0.8);
	this.btn.alpha = 0;
	this.btn.visible = false;

	this.logo = new lib.logo2_2();
	this.logo.parent = this;
	this.logo.setTransform(95.5,44,1,1,0,0,0,0.5,0);
	this.logo.alpha = 0;
	this.logo.visible = false;

	this.timeline.addTween(cjs.Tween.get({}).to({state:[{t:this.logo},{t:this.btn},{t:this.legal}]}).wait(1));

	// black
	this.black = new lib.black();
	this.black.parent = this;
	this.black.setTransform(-13,-44,1,1,90);
	this.black.visible = false;

	this.timeline.addTween(cjs.Tween.get(this.black).wait(1));

	// product3
	this.product3 = new lib.product3_1();
	this.product3.parent = this;
	this.product3.setTransform(545.5,80.7,0.4,0.4,0,0,0,0.7,64.2);
	this.product3.visible = false;

	this.timeline.addTween(cjs.Tween.get(this.product3).wait(1));

	// phone
	this.phone = new lib.phone_1();
	this.phone.parent = this;
	this.phone.setTransform(511.2,45.2,0.22,0.22,0,0,0,1.2,1.2);

	this.timeline.addTween(cjs.Tween.get(this.phone).wait(1));

	// product1
	this.product1 = new lib.product1_1();
	this.product1.parent = this;
	this.product1.setTransform(474,82,0.35,0.35,0,0,0,0.3,106.6);
	this.product1.visible = false;

	this.timeline.addTween(cjs.Tween.get(this.product1).wait(1));

	// logos
	this.galaxy_es = new lib.galaxy_es();
	this.galaxy_es.parent = this;
	this.galaxy_es.setTransform(661,65,1,1,0,0,0,-29,-8);
	this.galaxy_es.alpha = 0;

	this.galaxy = new lib.galaxy();
	this.galaxy.parent = this;
	this.galaxy.setTransform(657,18);
	this.galaxy.visible = false;

	this.samsung = new lib.samsung();
	this.samsung.parent = this;
	this.samsung.setTransform(61,17);
	this.samsung.visible = false;

	this.timeline.addTween(cjs.Tween.get({}).to({state:[{t:this.samsung},{t:this.galaxy},{t:this.galaxy_es}]}).wait(1));

	// Layer 7
	this.txt3 = new lib.txt3();
	this.txt3.parent = this;
	this.txt3.setTransform(289,46.2);
	this.txt3.visible = false;

	this.txt2 = new lib.txt2();
	this.txt2.parent = this;
	this.txt2.setTransform(291,45);
	this.txt2.visible = false;

	this.txt1 = new lib.txt1();
	this.txt1.parent = this;
	this.txt1.setTransform(290,45);
	this.txt1.visible = false;

	this.timeline.addTween(cjs.Tween.get({}).to({state:[{t:this.txt1},{t:this.txt2},{t:this.txt3}]}).wait(1));

	// white
	this.white = new lib.white();
	this.white.parent = this;
	this.white.setTransform(555,45.1);
	this.white.alpha = 0.5;

	this.timeline.addTween(cjs.Tween.get(this.white).wait(1));

	// mask (mask)
	var mask = new cjs.Shape();
	mask._off = true;
	mask.graphics.p("Ai4F8IAAr3IFxAAIAAL3g");
	mask.setTransform(511.5,45);

	// back
	this.back = new lib.back();
	this.back.parent = this;
	this.back.setTransform(364,65);

	var maskedShapeInstanceList = [this.back];

	for(var shapedInstanceItr = 0; shapedInstanceItr < maskedShapeInstanceList.length; shapedInstanceItr++) {
		maskedShapeInstanceList[shapedInstanceItr].mask = mask;
	}

	this.timeline.addTween(cjs.Tween.get(this.back).wait(1));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(-862,-54.9,2094,423);
// library properties:
lib.properties = {
	width: 728,
	height: 90,
	fps: 30,
	color: "#FFFFFF",
	opacity: 1.00,
	manifest: [
		{src:"images/back_970.jpg?1491412077409", id:"back_970"},
		{src:"images/index_atlas_P_.png?1491412077349", id:"index_atlas_P_"}
	],
	preloads: []
};




})(lib = lib||{}, images = images||{}, createjs = createjs||{}, ss = ss||{}, AdobeAn = AdobeAn||{});
var lib, images, createjs, ss, AdobeAn;