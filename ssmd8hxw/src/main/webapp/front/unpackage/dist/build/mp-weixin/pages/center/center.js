(global["webpackJsonp"]=global["webpackJsonp"]||[]).push([["pages/center/center"],{"0417":function(t,e,n){"use strict";var r=n("95cb"),a=n.n(r);a.a},1035:function(t,e,n){"use strict";n.r(e);var r=n("c2c4"),a=n.n(r);for(var u in r)"default"!==u&&function(t){n.d(e,t,(function(){return r[t]}))}(u);e["default"]=a.a},"95cb":function(t,e,n){},a788:function(t,e,n){"use strict";(function(t){n("95db");r(n("66fd"));var e=r(n("c0a2"));function r(t){return t&&t.__esModule?t:{default:t}}t(e.default)}).call(this,n("543d")["createPage"])},b45c:function(t,e,n){"use strict";var r;n.d(e,"b",(function(){return a})),n.d(e,"c",(function(){return u})),n.d(e,"a",(function(){return r}));var a=function(){var t=this,e=t.$createElement;t._self._c},u=[]},c0a2:function(t,e,n){"use strict";n.r(e);var r=n("b45c"),a=n("1035");for(var u in a)"default"!==u&&function(t){n.d(e,t,(function(){return a[t]}))}(u);n("0417");var c,o=n("f0c5"),i=Object(o["a"])(a["default"],r["b"],r["c"],!1,null,null,null,!1,r["a"],c);e["default"]=i.exports},c2c4:function(t,e,n){"use strict";(function(t){Object.defineProperty(e,"__esModule",{value:!0}),e.default=void 0;var r=u(n("a34a")),a=u(n("5ded"));function u(t){return t&&t.__esModule?t:{default:t}}function c(t,e,n,r,a,u,c){try{var o=t[u](c),i=o.value}catch(s){return void n(s)}o.done?e(i):Promise.resolve(i).then(r,a)}function o(t){return function(){var e=this,n=arguments;return new Promise((function(r,a){var u=t.apply(e,n);function o(t){c(u,r,a,o,i,"next",t)}function i(t){c(u,r,a,o,i,"throw",t)}o(void 0)}))}}var i={data:function(){return{isH5Plus:!0,user:{},tableName:"",role:"",menuList:[]}},onLoad:function(){var e=this;return o(r.default.mark((function n(){var u,c,o;return r.default.wrap((function(n){while(1)switch(n.prev=n.next){case 0:return e.role=t.getStorageSync("role"),u=t.getStorageSync("nowTable"),n.next=4,e.$api.session(u);case 4:c=n.sent,e.user=c.data,e.tableName=u,o=a.default.list(),e.menuList=o;case 9:case"end":return n.stop()}}),n)})))()},onShow:function(){var e=this;return o(r.default.mark((function n(){var u,c,o;return r.default.wrap((function(n){while(1)switch(n.prev=n.next){case 0:return e.role=t.getStorageSync("role"),u=t.getStorageSync("nowTable"),n.next=4,e.$api.session(u);case 4:c=n.sent,e.user=c.data,e.tableName=u,o=a.default.list(),e.menuList=o;case 9:case"end":return n.stop()}}),n)})))()},methods:{onPageTap:function(e){t.navigateTo({url:e,fail:function(){t.switchTab({url:e})}})}}};e.default=i}).call(this,n("543d")["default"])}},[["a788","common/runtime","common/vendor"]]]);