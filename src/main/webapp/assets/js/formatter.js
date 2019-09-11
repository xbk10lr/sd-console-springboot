/**
 * easyui datagrid filed映射
 */
	function formatterTaskStatus(value, row, index){
		if(value==""|| value==null){
			return;
		}else if(row.taskStatus==0){
			return "开启";
		}else if(row.taskStatus==1){
			return "关闭";
		}
	};

	function formatterDate(value, row, index){
		if(value == null){
			return;
		} else{
			var date = new Date(value.time);
	        var y = date.getFullYear();
	        var m = date.getMonth() + 1;
	        var d = date.getDate();
	        var h = date.getHours();
	        var M = date.getMinutes();
	        var s = date.getSeconds();
	        return y + '-' +m + '-' + d + ' ' + h + ':' + M + ':' + s;
		}
	};
	
	function formatterStatus(value, row, index){
		if(value==""|| value==null){
			return;
		}else if(row.status=='FAILED'){
			return "失败";
		}else if(row.status=='STARTED'){
			return "已启动";
		}else if(row.status=='COMPLETED'){
			return "已完成";
		}
	};
	
	function formatterExitCode(value, row, index){
		if(value==""|| value==null){
			return;
		}else if(row.exitCode=='FAILED'){
			return "失败";
		}else if(row.exitCode=='UNKNOWN'){
			return "未知";
		}else if(row.exitCode=='COMPLETED'){
			return "已完成";
		}
	};
