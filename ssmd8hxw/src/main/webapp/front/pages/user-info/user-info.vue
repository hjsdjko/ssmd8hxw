<template>
	<view class="content">
		<view :style='{"boxShadow":"0 0 4rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(23, 152, 242, 1)","margin":"0 0 20rpx 0","borderWidth":"0","borderStyle":"solid","height":"108rpx"}' v-if="tableName=='xiaoyou'" class="cu-form-group">
			<view class="title" :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left"}'>校友账号</view>
			<input  style="padding: 0 30upx" :style='{"boxShadow":"0 0 4rpx rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(102, 102, 153, 1)","borderRadius":"16rpx","color":"rgba(27, 26, 26, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.xiaoyouzhanghao" placeholder="校友账号"></input>
		</view>
		<view :style='{"boxShadow":"0 0 4rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(23, 152, 242, 1)","margin":"0 0 20rpx 0","borderWidth":"0","borderStyle":"solid","height":"108rpx"}' v-if="tableName=='xiaoyou'" class="cu-form-group">
			<view class="title" :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left"}'>密码</view>
			<input type="password" style="padding: 0 30upx" :style='{"boxShadow":"0 0 4rpx rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(102, 102, 153, 1)","borderRadius":"16rpx","color":"rgba(27, 26, 26, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.mima" placeholder="密码"></input>
		</view>
		<view :style='{"boxShadow":"0 0 4rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(23, 152, 242, 1)","margin":"0 0 20rpx 0","borderWidth":"0","borderStyle":"solid","height":"108rpx"}' v-if="tableName=='xiaoyou'" class="cu-form-group">
			<view class="title" :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left"}'>校友姓名</view>
			<input  style="padding: 0 30upx" :style='{"boxShadow":"0 0 4rpx rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(102, 102, 153, 1)","borderRadius":"16rpx","color":"rgba(27, 26, 26, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.xiaoyouxingming" placeholder="校友姓名"></input>
		</view>
		<view :style='{"boxShadow":"0 0 4rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(23, 152, 242, 1)","margin":"0 0 20rpx 0","borderWidth":"0","borderStyle":"solid","height":"108rpx"}' v-if="tableName=='xiaoyou'" class="cu-form-group">
			<view class="title" :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left"}'>年龄</view>
			<input  style="padding: 0 30upx" :style='{"boxShadow":"0 0 4rpx rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(102, 102, 153, 1)","borderRadius":"16rpx","color":"rgba(27, 26, 26, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.nianling" placeholder="年龄"></input>
		</view>
			<view v-if="tableName=='xiaoyou'" :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"#ccc","margin":"0 0 20rpx 0","borderWidth":"0","borderStyle":"solid","height":"108rpx"}' class="cu-form-group select">
                                <view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left"}' class="title">性别</view>
                                <picker @change="xiaoyouxingbieChange" :value="xiaoyouxingbieIndex" :range="xiaoyouxingbieOptions">
                                        <view style="padding: 0 30upx" :style='{"boxShadow":"0 0 4rpx rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(102, 102, 153, 1)","borderRadius":"16rpx","color":"rgba(27, 26, 26, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' class="uni-input picker-select-input">{{ruleForm.xingbie?ruleForm.xingbie:"请选择性别"}}</view>
                                </picker>
                        </view>
		<view :style='{"boxShadow":"0 0 4rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(23, 152, 242, 1)","margin":"0 0 20rpx 0","borderWidth":"0","borderStyle":"solid","height":"108rpx"}' v-if="tableName=='xiaoyou'" class="cu-form-group">
			<view class="title" :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left"}'>联系方式</view>
			<input  style="padding: 0 30upx" :style='{"boxShadow":"0 0 4rpx rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(102, 102, 153, 1)","borderRadius":"16rpx","color":"rgba(27, 26, 26, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.lianxifangshi" placeholder="联系方式"></input>
		</view>
		<view :style='{"boxShadow":"0 0 4rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(23, 152, 242, 1)","margin":"0 0 20rpx 0","borderWidth":"0","borderStyle":"solid","height":"108rpx"}' v-if="tableName=='xiaoyou'" @tap="xiaoyouzhaopianTap" class="cu-form-group" :class="left == 'left'?'':'active'">
			<view class="title" :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left"}'>照片</view>
			<view style="flex: 1;textAlign:left">
				<image :style='{"width":"88rpx","boxShadow":"0 0 16rpx rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"88rpx"}' v-if="ruleForm.zhaopian" style="margin: 0;" class="avator" :src="ruleForm.zhaopian" mode=""></image>
				<image :style='{"width":"88rpx","boxShadow":"0 0 16rpx rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"88rpx"}' v-else class="avator" style="margin: 0;" src="../../static/center/face.jpeg" mode=""></image>
			</view>
		</view>
		<view :style='{"boxShadow":"0 0 4rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(23, 152, 242, 1)","margin":"0 0 20rpx 0","borderWidth":"0","borderStyle":"solid","height":"108rpx"}' v-if="tableName=='xiaoyou'" class="cu-form-group">
			<view class="title" :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left"}'>地址</view>
			<input  style="padding: 0 30upx" :style='{"boxShadow":"0 0 4rpx rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(102, 102, 153, 1)","borderRadius":"16rpx","color":"rgba(27, 26, 26, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.dizhi" placeholder="地址"></input>
		</view>
		<view :style='{"boxShadow":"0 0 4rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(23, 152, 242, 1)","margin":"0 0 20rpx 0","borderWidth":"0","borderStyle":"solid","height":"108rpx"}' v-if="tableName=='paotuiyuan'" class="cu-form-group">
			<view class="title" :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left"}'>账号</view>
			<input  style="padding: 0 30upx" :style='{"boxShadow":"0 0 4rpx rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(102, 102, 153, 1)","borderRadius":"16rpx","color":"rgba(27, 26, 26, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.zhanghao" placeholder="账号"></input>
		</view>
		<view :style='{"boxShadow":"0 0 4rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(23, 152, 242, 1)","margin":"0 0 20rpx 0","borderWidth":"0","borderStyle":"solid","height":"108rpx"}' v-if="tableName=='paotuiyuan'" class="cu-form-group">
			<view class="title" :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left"}'>密码</view>
			<input type="password" style="padding: 0 30upx" :style='{"boxShadow":"0 0 4rpx rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(102, 102, 153, 1)","borderRadius":"16rpx","color":"rgba(27, 26, 26, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.mima" placeholder="密码"></input>
		</view>
		<view :style='{"boxShadow":"0 0 4rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(23, 152, 242, 1)","margin":"0 0 20rpx 0","borderWidth":"0","borderStyle":"solid","height":"108rpx"}' v-if="tableName=='paotuiyuan'" class="cu-form-group">
			<view class="title" :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left"}'>姓名</view>
			<input  style="padding: 0 30upx" :style='{"boxShadow":"0 0 4rpx rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(102, 102, 153, 1)","borderRadius":"16rpx","color":"rgba(27, 26, 26, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.xingming" placeholder="姓名"></input>
		</view>
		<view :style='{"boxShadow":"0 0 4rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(23, 152, 242, 1)","margin":"0 0 20rpx 0","borderWidth":"0","borderStyle":"solid","height":"108rpx"}' v-if="tableName=='paotuiyuan'" class="cu-form-group">
			<view class="title" :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left"}'>年龄</view>
			<input  style="padding: 0 30upx" :style='{"boxShadow":"0 0 4rpx rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(102, 102, 153, 1)","borderRadius":"16rpx","color":"rgba(27, 26, 26, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.nianling" placeholder="年龄"></input>
		</view>
			<view v-if="tableName=='paotuiyuan'" :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"#ccc","margin":"0 0 20rpx 0","borderWidth":"0","borderStyle":"solid","height":"108rpx"}' class="cu-form-group select">
                                <view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left"}' class="title">性别</view>
                                <picker @change="paotuiyuanxingbieChange" :value="paotuiyuanxingbieIndex" :range="paotuiyuanxingbieOptions">
                                        <view style="padding: 0 30upx" :style='{"boxShadow":"0 0 4rpx rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(102, 102, 153, 1)","borderRadius":"16rpx","color":"rgba(27, 26, 26, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' class="uni-input picker-select-input">{{ruleForm.xingbie?ruleForm.xingbie:"请选择性别"}}</view>
                                </picker>
                        </view>
		<view :style='{"boxShadow":"0 0 4rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(23, 152, 242, 1)","margin":"0 0 20rpx 0","borderWidth":"0","borderStyle":"solid","height":"108rpx"}' v-if="tableName=='paotuiyuan'" class="cu-form-group">
			<view class="title" :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left"}'>手机</view>
			<input  style="padding: 0 30upx" :style='{"boxShadow":"0 0 4rpx rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(102, 102, 153, 1)","borderRadius":"16rpx","color":"rgba(27, 26, 26, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.shouji" placeholder="手机"></input>
		</view>
		<view :style='{"boxShadow":"0 0 4rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(23, 152, 242, 1)","margin":"0 0 20rpx 0","borderWidth":"0","borderStyle":"solid","height":"108rpx"}' v-if="tableName=='paotuiyuan'" @tap="paotuiyuanzhaopianTap" class="cu-form-group" :class="left == 'left'?'':'active'">
			<view class="title" :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left"}'>照片</view>
			<view style="flex: 1;textAlign:left">
				<image :style='{"width":"88rpx","boxShadow":"0 0 16rpx rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"88rpx"}' v-if="ruleForm.zhaopian" style="margin: 0;" class="avator" :src="ruleForm.zhaopian" mode=""></image>
				<image :style='{"width":"88rpx","boxShadow":"0 0 16rpx rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"88rpx"}' v-else class="avator" style="margin: 0;" src="../../static/center/face.jpeg" mode=""></image>
			</view>
		</view>
		
		<view class="btn">
			<view class="box" :style="{width: 'auto'}">
				<button @tap="update()" class="cu-btn lg" :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,0) inset","backgroundColor":"#409EFF","borderColor":"#409EFF","borderRadius":"8rpx","color":"#fff","borderWidth":"1","width":"auto","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}'>保存</button>
			</view>

			<view class="box" :style="{width: 'auto'}">
				<button @tap="logout()" class="cu-btn lg" :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,0) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"rgba(255, 255, 255, 1)","borderRadius":"8rpx","color":"rgba(0, 0, 0, 1)","borderWidth":"0px","width":"auto","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}'>退出登录</button>
			</view>
		</view>
	</view>
</template>

<script>
	export default {
		data() {
			return {
				ruleForm: {
				},
				tableName:"",
				xiaoyouxingbieOptions: [],
				xiaoyouxingbieIndex: 0,
				paotuiyuanxingbieOptions: [],
				paotuiyuanxingbieIndex: 0,
			}
		},
		async onLoad() {
			let table = uni.getStorageSync("nowTable");
			let res = await this.$api.session(table);
			this.ruleForm = res.data;
			this.tableName = table;
			// 自定义下拉框值
			if(this.tableName=='xiaoyou'){
				this.xiaoyouxingbieOptions = "男,女".split(',');
				this.xiaoyouxingbieOptions.forEach((item, index) => {
					if(item==this.ruleForm.xingbie) {
						this.xiaoyouxingbieIndex = index;
					}
				});
			}
			// 自定义下拉框值
			if(this.tableName=='paotuiyuan'){
				this.paotuiyuanxingbieOptions = "男,女".split(',');
				this.paotuiyuanxingbieOptions.forEach((item, index) => {
					if(item==this.ruleForm.xingbie) {
						this.paotuiyuanxingbieIndex = index;
					}
				});
			}
			this.styleChange()
		},
		methods: {
                        // 下拉变化
                        xiaoyouxingbieChange(e) {
                                this.xiaoyouxingbieIndex = e.target.value
                                this.ruleForm.xingbie = this.xiaoyouxingbieOptions[this.xiaoyouxingbieIndex]
                        },
                        // 下拉变化
                        paotuiyuanxingbieChange(e) {
                                this.paotuiyuanxingbieIndex = e.target.value
                                this.ruleForm.xingbie = this.paotuiyuanxingbieOptions[this.paotuiyuanxingbieIndex]
                        },
			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.cu-form-group .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.userInfoForm.list.input.backgroundColor
					// })
				})
			},
			// 获取uuid
			getUUID () {
				return new Date().getTime();
			},
			logout() {
				uni.setStorageSync('token', '');
				this.$utils.jump('../login/login');
			},
			// 注册
			async update() {
				if((!this.ruleForm.xiaoyouzhanghao) && `xiaoyou` == this.tableName){
					this.$utils.msg(`校友账号不能为空`);
					return
				}
				if((!this.ruleForm.mima) && `xiaoyou` == this.tableName){
					this.$utils.msg(`密码不能为空`);
					return
				}
				if((!this.ruleForm.xiaoyouxingming) && `xiaoyou` == this.tableName){
					this.$utils.msg(`校友姓名不能为空`);
					return
				}
				if((!this.ruleForm.nianling) && `xiaoyou` == this.tableName){
					this.$utils.msg(`年龄不能为空`);
					return
				}
				if(`xiaoyou` == this.tableName && this.ruleForm.nianling&&(!this.$validate.isIntNumer(this.ruleForm.nianling))){
					this.$utils.msg(`年龄应输入整数`);
					return
				}
				if((!this.ruleForm.lianxifangshi) && `xiaoyou` == this.tableName){
					this.$utils.msg(`联系方式不能为空`);
					return
				}
				if(`xiaoyou` == this.tableName && this.ruleForm.lianxifangshi&&(!this.$validate.isMobile(this.ruleForm.lianxifangshi))){
					this.$utils.msg(`联系方式应输入手机格式`);
					return
				}
				if((!this.ruleForm.zhanghao) && `paotuiyuan` == this.tableName){
					this.$utils.msg(`账号不能为空`);
					return
				}
				if((!this.ruleForm.mima) && `paotuiyuan` == this.tableName){
					this.$utils.msg(`密码不能为空`);
					return
				}
				if((!this.ruleForm.xingming) && `paotuiyuan` == this.tableName){
					this.$utils.msg(`姓名不能为空`);
					return
				}
				if((!this.ruleForm.nianling) && `paotuiyuan` == this.tableName){
					this.$utils.msg(`年龄不能为空`);
					return
				}
				if(`paotuiyuan` == this.tableName && this.ruleForm.nianling&&(!this.$validate.isIntNumer(this.ruleForm.nianling))){
					this.$utils.msg(`年龄应输入整数`);
					return
				}
				if((!this.ruleForm.shouji) && `paotuiyuan` == this.tableName){
					this.$utils.msg(`手机不能为空`);
					return
				}
				if(`paotuiyuan` == this.tableName && this.ruleForm.shouji&&(!this.$validate.isMobile(this.ruleForm.shouji))){
					this.$utils.msg(`手机应输入手机格式`);
					return
				}
				let table = uni.getStorageSync("nowTable");
				await this.$api.update(table, this.ruleForm);
				this.$utils.msgBack('修改成功');;
			}

			,xiaoyouzhaopianTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.zhaopian = _this.$base.url + 'upload/' + res.file;
					_this.$forceUpdate();
				});
			}
			,paotuiyuanzhaopianTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.zhaopian = _this.$base.url + 'upload/' + res.file;
					_this.$forceUpdate();
				});
			}
		}
	}
</script>

<style lang="scss" scoped>
	.content:after {
		position: fixed;
		top: 0;
		right: 0;
		left: 0;
		bottom: 0;
		content: '';
				background-attachment: fixed;
		background-size: cover;
		background-position: center;
	}

	.avator {
		width: 110upx;
		height: 110upx;
		border-radius: 50%;
		margin-left: 30upx;
	}
	
	.cu-form-group.active {
		justify-content: space-between;
	}

	.cu-btn {
		width: 100%;
	}

	.right-input {
		flex: 1;
		text-align: left;
		line-height: 88rpx;
	}
	.btn {
	  display: flex;
	  align-items: center;
	  justify-content: center;
	  flex-wrap: wrap;
	  padding: 20upx 0;
	}
	
	.box {
	  width: auto;
	  padding: 0 10upx;
	  box-sizing: border-box;
	  margin-bottom: 20upx;
	}
	
	.cu-btn {
	  width: 100% !important;
	}

.picker-select-input {
	line-height: 88rpx;
}
</style>
