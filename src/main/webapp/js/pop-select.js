/**
 * Populating the TreadMill(mins) drop down in add-wo-detail.html
 */
var optionsTreadMill = [ {
	"text" : "0(mins)",
	"value" : "0",
	"selected" : true
}, {
	"text" : "5(mins)",
	"value" : "5"
}, {
	"text" : "6(mins)",
	"value" : "6"
}, {
	"text" : "7(mins)",
	"value" : "7"
}, {
	"text" : "8(mins)",
	"value" : "8"
}, {
	"text" : "9(mins)",
	"value" : "9"
}  , {
	"text" : "10(mins)",
	"value" : "10"
}  , {
	"text" : "11(mins)",
	"value" : "11"
}  , {
	"text" : "12(mins)",
	"value" : "12"
} , {
	"text" : "13(mins)",
	"value" : "13"
}  , {
	"text" : "14(mins)",
	"value" : "14"
}  , {
	"text" : "15(mins)",
	"value" : "15"
}  , {
	"text" : "16(mins)",
	"value" : "16"
}  , {
	"text" : "17(mins)",
	"value" : "17"
}  , {
	"text" : "18(mins)",
	"value" : "18"
}  , {
	"text" : "19(mins)",
	"value" : "19"
}  , {
	"text" : "20(mins)",
	"value" : "20"
}     ];

var selectBoxTread = document.getElementById('treadmill_min_sel');

for (var i = 0, l = optionsTreadMill.length; i < l; i++) {
	var option = optionsTreadMill[i];
	selectBoxTread.options
			.add(new Option(option.text, option.value, option.selected));
}

/**
 * Populating the Cycling(mins) drop down in add-wo-detail.html
 */
var optionsCycling = [ {
	"text" : "0(mins)",
	"value" : "0",
	"selected" : true
}, 
 {
	"text" : "5(mins)",
	"value" : "5"
},{
	"text" : "6(mins)",
	"value" : "6"
}, {
	"text" : "7(mins)",
	"value" : "7"
}, {
	"text" : "8(mins)",
	"value" : "8"
}, {
	"text" : "9(mins)",
	"value" : "9"
}  , {
	"text" : "10(mins)",
	"value" : "10"
}  , {
	"text" : "11(mins)",
	"value" : "11"
}  , {
	"text" : "12(mins)",
	"value" : "12"
} , {
	"text" : "13(mins)",
	"value" : "13"
}  , {
	"text" : "14(mins)",
	"value" : "14"
}  , {
	"text" : "15(mins)",
	"value" : "15"
}  , {
	"text" : "16(mins)",
	"value" : "16"
}  , {
	"text" : "17(mins)",
	"value" : "17"
}  , {
	"text" : "18(mins)",
	"value" : "18"
}  , {
	"text" : "19(mins)",
	"value" : "19"
}  , {
	"text" : "20(mins)",
	"value" : "20"
}     ];

var selectBoxCycling = document.getElementById('cyclig_min_sel');

for (var i = 0, l = optionsCycling.length; i < l; i++) {
	var option = optionsCycling[i];
	selectBoxCycling.options
			.add(new Option(option.text, option.value, option.selected));
}