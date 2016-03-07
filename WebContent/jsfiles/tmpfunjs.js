/**
 * 练习使用的js
 */
function changecity() {
	var province = ["辽宁", "陕西", "山东"];
	var citys = [
		["沈阳", "大连", "鞍山"],
		["西安", "咸阳", "宝鸡", "汉中"],
		["青岛", "济南", "烟台", "威海", "泰安"]
	];
	selected = document.getElementById("province").value;
	cityselect = document.getElementById("city_op");
	cityselect.length = citys[selected - 1].length;

	for (i = 0; i < citys[selected - 1].length; i++) {
		cityselect.options[i].value = selected * 10 + i + 1;
		cityselect.options[i].text = citys[selected - 1][i];
	}
}