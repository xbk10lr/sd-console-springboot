var _menus_oneLeve=[{"menuid":"0","menuname":"批量管理","icon":"fa-home"},{"menuid":"1","menuname":"订单管理","icon":"fa-trophy"},{"menuid":"2","menuname":"差错管理","icon":"fa-inbox"},{"menuid":"3","menuname":"清算管理","icon":"fa-suitcase"},{"menuid":"4","menuname":"人员管理","icon":"fa-dropbox"}/*,{"menuid":"3","menuname":"文档帮助","icon":"fa-suitcase"},{"menuid":"4","menuname":"系统管理","icon":"fa-dropbox"}*/];
var _menus=[
    {"menuid":"00","icon":"fa-trophy","menuname":"日终任务管理",parentMenu:'0',
        "menus":[/*{"menuid":"000","menuname":"视图","icon":"fa-dashboard","url":"kanban.html"}*/
	        	/*{"menuid":"001","menuname":"仪表盘","icon":"fa-delicious","url":"dashboard.html"}*/
        		{"menuid":"000","menuname":"任务查看","icon":"fa-dashboard","url":"demo/showJob.html"},
        		{"menuid":"001","menuname":"任务手动运行","icon":"fa-delicious","url":"demo/runJob.html"},
        		{"menuid":"002","menuname":"任务续跑","icon":"fa-delicious","url":"demo/showJobRunStatus.html"}
            ]},/*{
     "menuid":"01","icon":"fa-television","menuname":"表单成功案例",parentMenu:'0',
        "menus":[{"menuid":"010","menuname":"代办事项","icon":"fa-tty","url":"https://item.taobao.com/item.htm?id=545823027227"},
                {"menuid":"011","menuname":"公告通知","icon":"fa-volume-up","url":""}
            ]
    },*/
	{"menuid":"11","icon":"fa-trophy","menuname":"商户订单管理",parentMenu:'1',
		"menus":[{"menuid":"110","menuname":"商户订单查看","icon":"fa-window-restore","url":"demo/showMerOrder.html"},
                /*{"menuid":"111","menuname":"弹窗表单二","icon":"fa-window-restore","url":"demo/form-success-popup2.html"},
                {"menuid":"112","menuname":"创新表单一","icon":"fa-window-maximize","url":"demo/form-success1.html"},
                {"menuid":"113","menuname":"创新表单二","icon":"fa-window-maximize","url":"demo/form-success2.html"},
                {"menuid":"114","menuname":"一列表单","icon":"fa-align-center","url":"demo/form1.html"},
                {"menuid":"115","menuname":"一列面板表单","icon":"fa-align-center","url":"demo/form2.html"},
                {"menuid":"116","menuname":"两列表单","icon":"fa-columns","url":"demo/form2-column.html"},
                {"menuid":"117","menuname":"两列面板表单","icon":"fa-columns","url":"demo/form2-column2.html"},*/
			]},{
     "menuid":"12","icon":"fa-television","menuname":"通道订单管理",parentMenu:'1',
        "menus":[{"menuid":"120","menuname":"通道订单查看","icon":"fa-globe","url":"demo/showChannelOrder.html"},
                /*{"menuid":"121","menuname":"设计作品","icon":"fa-laptop","url":"http://www.uimaker.com/member/index.php?uid=poya"},
                {"menuid":"122","menuname":"成功作品","icon":"fa-laptop","url":"http://www.uedna.com/user/33963/"},
                {"menuid":"122","menuname":"金典案例","icon":"fa-laptop","url":"http://www.zcool.com.cn/u/16062070"}*/
            ]
    },
	{"menuid":"21","icon":"fa-plug","menuname":"对账差错管理",parentMenu:'2',
		"menus":[
            {"menuid":"210","menuname":"对账差错查看","icon":"fa-toggle-down","url":"demo/showCheckError.html"},
            /*{"menuid":"211","menuname":"提示条","icon":"fa-puzzle-piece","url":"demo/msgTip.html"},
            {"menuid":"212","menuname":"模态框","icon":"fa-desktop","url":"demo/msgTip.html"},
            {"menuid":"213","menuname":"弹出框","icon":"fa-window-restore","url":"demo/msgTip.html"},
            {"menuid":"214","menuname":"日历","icon":"fa-calendar","url":"demo/msgTip.html"},
            {"menuid":"215","menuname":"下拉框","icon":"fa-chevron-circle-down","url":"demo/msgTip.html"},
            {"menuid":"216","menuname":"选项卡","icon":"fa-laptop","url":"demo/msgTip.html"},
            {"menuid":"217","menuname":"按钮","icon":"fa-square","url":"demo/msgTip.html"},
            {"menuid":"218","menuname":"表格","icon":"fa-th","url":"demo/msgTip.html"},
            {"menuid":"219","menuname":"EasyUI表格","icon":"fa-th","url":"demo/msgTip.html"}*/
		]
	},
	{"menuid":"41","icon":"fa-cubes","menuname":"管理员管理",parentMenu:'4',
		"menus":[{"menuid":"410","menuname":"新增管理员","icon":"fa-dot-circle-o","url":""},
			{"menuid":"411","menuname":"编辑管理员信息","icon":"fa-sticky-note","url":""}
            /*{"menuid":"222","menuname":"手风琴","icon":"fa-window-minimize","url":"demo/msgTip.html"},
            {"menuid":"223","menuname":"分页","icon":"fa-sort-numeric-asc","url":"demo/msgTip.html"},
            {"menuid":"224","menuname":"标签","icon":"fa-bookmark","url":"demo/msgTip.html"},
            {"menuid":"225","menuname":"缩略图","icon":"fa-image","url":"demo/msgTip.html"},
            {"menuid":"226","menuname":"警告框","icon":"fa-warning","url":"demo/msgTip.html"},
            {"menuid":"227","menuname":"进度条","icon":"fa-sliders","url":"demo/msgTip.html"},
            {"menuid":"228","menuname":"列表组","icon":"fa-navicon","url":"demo/msgTip.html"},
            {"menuid":"229","menuname":"面版","icon":"fa-th-large","url":"demo/msgTip.html"},
            {"menuid":"2201","menuname":"树","icon":"fa-sitemap","url":"comp/msgTip.html"}*/
		]
	},
    {"menuid":"31","icon":"fa-suitcase","menuname":"商户清算管理",parentMenu:'3',
    	"menus":[{"menuid":"310","menuname":"商户订单日统计","icon":"fa-inbox","url":"demo/showMerSum.html"}
    			/*{"menuid":"312","menuname":"我的分享","icon":"fa-share-alt-square","url":"demo/msgTip.html"}*/
    		]
    	},
	 {"menuid":"32","icon":"fa-suitcase","menuname":"通道清算管理",parentMenu:'3',
		"menus":[{"menuid":"320","menuname":"通道订单日统计","icon":"fa-inbox","url":"demo/showChannelSum.html"},
				/*{"menuid":"312","menuname":"我的分享","icon":"fa-share-alt-square","url":"demo/msgTip.html"}*/
			]
		},
	/*{"menuid":"41","icon":"fa-dashboard","menuname":"系统仪表板",parentMenu:'4',
		"menus":[
			{"menuid":"411","menuname":"系统管理","icon":"fa-id-card","url":"demo/resource.html"},
			{"menuid":"412","menuname":"表单示例","icon":"fa-users","url":"demo/msgTip.html"},
			{"menuid":"413","menuname":"角色管理","icon":"fa-address-card","url":"demo/msgTip.html"},
			{"menuid":"414","menuname":"权限设置","icon":"fa-user-plus","url":"demo/msgTip.html"},
			{"menuid":"415","menuname":"升级日志","icon":"fa-list","url":"https://blog.csdn.net/DJCBPL/article/details/80281869"}
		]
	}*/
		
];

    //设置登录窗口
    function openPwd() {$('#updatePwd').window({title: '修改密码', width: 300, modal: true, shadow: true, closed: true, height: 160, resizable:false }); }
    //关闭登录窗口
    function closePwd() {$('#updatePwd').window('close');}

    //修改密码
    function serverLogin() {
        var $newpass = $('#txtNewPass');
        var $rePass = $('#txtRePass');

        if ($newpass.val() == '') {
            msgShow('系统提示', '请输入密码！', 'admin');
            return false;
        }
        if ($rePass.val() == '') {
            msgShow('系统提示', '请在一次输入密码！', 'admin');
            return false;
        }

        if ($newpass.val() != $rePass.val()) {
            msgShow('系统提示', '两次密码不一至！请重新输入', 'admin');
            return false;
        }

        $.post('/ajax=' + $newpass.val(), function(msg) {
            msgShow('系统提示', '恭喜，密码修改成功！<br>您的新密码为：' + msg, 'info');
            $newpass.val('');
            $rePass.val('');
            close();
        })
        
    }

    $(function() {
        openPwd();

        $('#editpass').click(function(){$('#updatePwd').window('open');});

        $('#btnEp').click(function(){serverLogin();});

		$('#btnCancel').click(function(){closePwd();});

        $('#loginOut').click(function() {
            $.messager.confirm('系统提示', '您确定要退出本次登录吗?', function(r) {

                if (r) {
                    location.href = 'login.html';
                }
            });
        })
    });

$(function(){var mydate = new Date(); var tm=mydate.getFullYear(); $("#timeYear").text(tm); });