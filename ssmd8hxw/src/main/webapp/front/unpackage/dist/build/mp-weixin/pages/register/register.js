(global["webpackJsonp"]=global["webpackJsonp"]||[]).push([["pages/register/register"],{"11c9":function(e,t,n){"use strict";n.r(t);var a=n("2cbd"),i=n.n(a);for(var r in a)"default"!==r&&function(e){n.d(t,e,(function(){return a[e]}))}(r);t["default"]=i.a},"2cbd":function(e,t,n){"use strict";(function(e){Object.defineProperty(t,"__esModule",{value:!0}),t.default=void 0;var a=i(n("a34a"));function i(e){return e&&e.__esModule?e:{default:e}}function r(e,t,n,a,i,r,u){try{var o=e[r](u),s=o.value}catch(l){return void n(l)}o.done?t(s):Promise.resolve(s).then(a,i)}function u(e){return function(){var t=this,n=arguments;return new Promise((function(a,i){var u=e.apply(t,n);function o(e){r(u,a,i,o,s,"next",e)}function s(e){r(u,a,i,o,s,"throw",e)}o(void 0)}))}}var o={data:function(){return{xiaoyouxingbieOptions:[],xiaoyouxingbieIndex:0,paotuiyuanxingbieOptions:[],paotuiyuanxingbieIndex:0,ruleForm:{},tableName:""}},onLoad:function(){var t=this;return u(a.default.mark((function n(){var i;return a.default.wrap((function(n){while(1)switch(n.prev=n.next){case 0:[],i=e.getStorageSync("loginTable"),t.tableName=i,"xiaoyou"==t.tableName&&(t.xiaoyouxingbieOptions="男,女".split(","),t.ruleForm.xingbie=t.xiaoyouxingbieOptions[0]),"paotuiyuan"==t.tableName&&(t.paotuiyuanxingbieOptions="男,女".split(","),t.ruleForm.xingbie=t.paotuiyuanxingbieOptions[0]),t.styleChange();case 6:case"end":return n.stop()}}),n)})))()},methods:{xiaoyouxingbieChange:function(e){this.xiaoyouxingbieIndex=e.target.value,this.ruleForm.xingbie=this.xiaoyouxingbieOptions[this.xiaoyouxingbieIndex]},paotuiyuanxingbieChange:function(e){this.paotuiyuanxingbieIndex=e.target.value,this.ruleForm.xingbie=this.paotuiyuanxingbieOptions[this.paotuiyuanxingbieIndex]},styleChange:function(){this.$nextTick((function(){}))},getUUID:function(){return(new Date).getTime()},register:function(){var e=this;return u(a.default.mark((function t(){return a.default.wrap((function(t){while(1)switch(t.prev=t.next){case 0:if(e.ruleForm.xiaoyouzhanghao||"xiaoyou"!=e.tableName){t.next=3;break}return e.$utils.msg("校友账号不能为空"),t.abrupt("return");case 3:if(e.ruleForm.mima||"xiaoyou"!=e.tableName){t.next=6;break}return e.$utils.msg("密码不能为空"),t.abrupt("return");case 6:if(e.ruleForm.xiaoyouxingming||"xiaoyou"!=e.tableName){t.next=9;break}return e.$utils.msg("校友姓名不能为空"),t.abrupt("return");case 9:if(e.ruleForm.nianling||"xiaoyou"!=e.tableName){t.next=12;break}return e.$utils.msg("年龄不能为空"),t.abrupt("return");case 12:if("xiaoyou"!=e.tableName||!e.ruleForm.nianling||e.$validate.isIntNumer(e.ruleForm.nianling)){t.next=15;break}return e.$utils.msg("年龄应输入整数"),t.abrupt("return");case 15:if(e.ruleForm.lianxifangshi||"xiaoyou"!=e.tableName){t.next=18;break}return e.$utils.msg("联系方式不能为空"),t.abrupt("return");case 18:if("xiaoyou"!=e.tableName||!e.ruleForm.lianxifangshi||e.$validate.isMobile(e.ruleForm.lianxifangshi)){t.next=21;break}return e.$utils.msg("联系方式应输入手机格式"),t.abrupt("return");case 21:if(e.ruleForm.zhanghao||"paotuiyuan"!=e.tableName){t.next=24;break}return e.$utils.msg("账号不能为空"),t.abrupt("return");case 24:if(e.ruleForm.mima||"paotuiyuan"!=e.tableName){t.next=27;break}return e.$utils.msg("密码不能为空"),t.abrupt("return");case 27:if(e.ruleForm.xingming||"paotuiyuan"!=e.tableName){t.next=30;break}return e.$utils.msg("姓名不能为空"),t.abrupt("return");case 30:if(e.ruleForm.nianling||"paotuiyuan"!=e.tableName){t.next=33;break}return e.$utils.msg("年龄不能为空"),t.abrupt("return");case 33:if("paotuiyuan"!=e.tableName||!e.ruleForm.nianling||e.$validate.isIntNumer(e.ruleForm.nianling)){t.next=36;break}return e.$utils.msg("年龄应输入整数"),t.abrupt("return");case 36:if(e.ruleForm.shouji||"paotuiyuan"!=e.tableName){t.next=39;break}return e.$utils.msg("手机不能为空"),t.abrupt("return");case 39:if("paotuiyuan"!=e.tableName||!e.ruleForm.shouji||e.$validate.isMobile(e.ruleForm.shouji)){t.next=42;break}return e.$utils.msg("手机应输入手机格式"),t.abrupt("return");case 42:return t.next=44,e.$api.register("".concat(e.tableName),e.ruleForm);case 44:e.$utils.msgBack("注册成功");case 46:case"end":return t.stop()}}),t)})))()}}};t.default=o}).call(this,n("543d")["default"])},"380e":function(e,t,n){},"53ad":function(e,t,n){"use strict";(function(e){n("95db");a(n("66fd"));var t=a(n("fa18"));function a(e){return e&&e.__esModule?e:{default:e}}e(t.default)}).call(this,n("543d")["createPage"])},6532:function(e,t,n){"use strict";var a=n("380e"),i=n.n(a);i.a},"8e23":function(e,t,n){"use strict";var a;n.d(t,"b",(function(){return i})),n.d(t,"c",(function(){return r})),n.d(t,"a",(function(){return a}));var i=function(){var e=this,t=e.$createElement;e._self._c},r=[]},fa18:function(e,t,n){"use strict";n.r(t);var a=n("8e23"),i=n("11c9");for(var r in i)"default"!==r&&function(e){n.d(t,e,(function(){return i[e]}))}(r);n("6532");var u,o=n("f0c5"),s=Object(o["a"])(i["default"],a["b"],a["c"],!1,null,"1dacb4f5",null,!1,a["a"],u);t["default"]=s.exports}},[["53ad","common/runtime","common/vendor"]]]);