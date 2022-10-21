<template>
  <div class="app-container">
    <div class="box box-element">
      <div class="view">
        <div class="carousel slide" id="myCarousel">
          <ol class="carousel-indicators">
            <li class="active" data-slide-to="0" data-target="#myCarousel"></li>
            <li data-slide-to="1" data-target="#myCarousel" class=""></li>
            <li data-slide-to="2" data-target="#myCarousel" class=""></li>
          </ol>
          <div class="carousel-inner">
            <div class="item">
              <img alt="" src="@/assets/images/default1.jpg">
              <div class="carousel-caption">
<!--                <h4>Second Thumbnail label</h4>-->
                <p>
                  Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.
                </p>
              </div>
            </div>
          </div>

          <a class="left carousel-control" href="#myCarousel" data-slide="prev">
            <span class="glyphicon glyphicon-chevron-left"></span>
          </a>
          <a class="right carousel-control" href="#myCarousel" data-slide="next">
            <span class="glyphicon glyphicon-chevron-right"></span>
          </a>
        </div>

      </div>
    </div>
    <br>
    <h3>随心练视频推送</h3>
    <hr>
    <el-row :gutter="15">
      <el-form ref="videoForm" :model="formData" :rules="rules" size="medium" label-width="100px">
        <el-col :span="12">
          <el-row type="flex" justify="start" align="middle" gutter="15">
          </el-row>
        </el-col>
        <el-col :span="12">
          <el-row type="flex" justify="end" align="middle" gutter="15">
          </el-row>
        </el-col>
        <el-col :span="12">
          <el-row type="flex" justify="start" align="middle" gutter="15">
          </el-row>
        </el-col>
        <el-col :span="12">
          <el-row type="flex" justify="end" align="middle" gutter="15">
          </el-row>
        </el-col>
        <el-col :span="24">
          <el-form-item label="上传" prop="uploadVideo" required>
            <el-upload ref="uploadVideo" :file-list="uploadVideofileList" :action="uploadVideoAction"
              :before-upload="uploadVideoBeforeUpload">
              <el-button size="small" type="primary" icon="el-icon-upload">点击上传</el-button>
            </el-upload>
          </el-form-item>
        </el-col>
        <el-col :span="24">
          <el-form-item size="large">
            <el-button type="primary" @click="submitForm">提交</el-button>
            <el-button @click="resetForm">重置</el-button>
          </el-form-item>
        </el-col>
      </el-form>
    </el-row>
    <hr>
    <div class="box box-element">
      <div class="view">
        <div class="row" id="new">
          <div class="col-md-4">
            <div class="thumbnail">
              <!--                            <img alt="300x200" th:src="@{../img/video1}">-->
              <div class="caption" contenteditable="true">
                <h3>Chinese Trade Train</h3>
                <!--                                <p>-->
                <!--                                    Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.-->
                <!--                                </p>-->
                <p>
                  <!--                                    <a class="btn btn-primary" href="#">Action</a>-->
                  <!--                                    <a class="btn" href="#">Action</a>-->
                  <video id="my-video1" class="video-js" controls preload="auto" width="350" height="250" data-setup="{}">
                    <source src="http://120.48.12.99:8080/examples/U2.mp4" type="video/mp4">
                  </video>
                </p>
              </div>
            </div>
          </div>
          <div class="col-md-4">
            <div class="thumbnail">
              <!--                            <img alt="300x200" th:src="@{../img/video1}">-->
              <div class="caption" contenteditable="true">
                <h3>Belt & Road Initiative</h3>
                <p>
                  <!--                                    <a class="btn btn-primary" href="#">Action</a>-->
                  <!--                                    <a class="btn" href="#">Action</a>-->
                  <video id="my-video2" class="video-js" controls preload="auto" width="350" height="250" data-setup="{}">
                    <source src="http://120.48.12.99:8080/examples/U3.mp4" type="video/mp4">
                  </video>
                </p>
              </div>
            </div>
          </div>
          <div class="col-md-4">
            <div class="thumbnail">
              <!--                            <img alt="300x200" th:src="@{../img/video1}">-->
              <div class="caption" contenteditable="true">
                <h3>Titanic</h3>
                <p>
                  <!--                                    <a class="btn btn-primary" href="#">Action</a>-->
                  <!--                                    <a class="btn" href="#">Action</a>-->
                  <video id="my-video3" class="video-js" controls preload="auto" width="350" height="250" data-setup="{}">
                    <source src="http://120.48.12.99:8080/examples/Titanic_01.mp4" type="video/mp4">
                  </video>
                </p>
              </div>
            </div>
          </div>
          <div class="col-md-4">
            <div class="thumbnail">
              <!--                            <img alt="300x200" th:src="@{../img/video1}">-->
              <div class="caption" contenteditable="true">
                <h3>The Silk Road</h3>
                <p>
                  <!--                                    <a class="btn btn-primary" href="#">Action</a>-->
                  <!--                                    <a class="btn" href="#">Action</a>-->
                  <video id="my-video4" class="video-js" controls preload="auto" width="350" height="250" data-setup="{}">
                    <source src="http://120.48.12.99:8080/examples/U1.mp4" type="video/mp4">
                  </video>
                </p>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>
<script>
export default {
  components: {},
  props: [],
  data() {
    return {
      formData: {
        uploadVideo: null,
      },
      rules: {},
      uploadVideoAction: 'https://jsonplaceholder.typicode.com/posts/',
      uploadVideofileList: [],
    }
  },
  computed: {},
  watch: {},
  created() {},
  mounted() {},
  methods: {
    submitForm() {
      this.$refs['videoForm'].validate(valid => {
        if (!valid) return
        // TODO 提交表单
      })
    },
    resetForm() {
      this.$refs['videoForm'].resetFields()
    },
    uploadVideoBeforeUpload(file) {
      let isRightSize = file.size / 1024 / 1024 < 2
      if (!isRightSize) {
        this.$message.error('文件大小超过 2MB')
      }
      return isRightSize
    },
  }
}

</script>
<style>
.el-upload__tip {
  line-height: 1.2;
}

</style>
