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
            <div class="item active">
              <img alt="" src="@/assets/images/default.jpg">
              <div class="carousel-caption">
<!--                <h4>First Thumbnail label</h4>-->
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
    <h3>随心练音乐推送</h3>
    <hr>
    <el-row :gutter="15">
      <el-form ref="musicForm" :model="formData" :rules="rules" size="medium" label-width="100px">
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
          <el-form-item label="上传" prop="uploadMusic" required>
            <el-upload ref="uploadMusic" :file-list="uploadMusicfileList" :action="uploadMusicAction"
              :before-upload="uploadMusicBeforeUpload">
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
              <div class="caption" contenteditable="true">
                <h3>Fa La La</h3>
                <p>
                  <audio controls width="450" height="250">
                    <source src="horse.ogg" type="audio/ogg">
                    <source src="http://120.48.12.99:8080/examples/Fa La La (a cappella).mp3" type="audio/mpeg">
                  </audio>
                </p>
              </div>
            </div>
          </div>
          <div class="col-md-4">
            <div class="thumbnail">
              <!--                            <img alt="300x200" th:src="@{../img/video1}">-->
              <div class="caption" contenteditable="true">
                <h3>Hey Jude</h3>
                <p>
                  <audio controls width="450" height="250">
                    <source src="horse.ogg" type="audio/ogg">
                    <source src="http://120.48.12.99:8080/examples/HeyJude.mp3" type="audio/mpeg">
                  </audio>
                </p>
              </div>
            </div>
          </div>
          <div class="col-md-4">
            <div class="thumbnail">
              <!--                            <img alt="300x200" th:src="@{../img/video1}">-->
              <div class="caption" contenteditable="true">
                <h3>You Rise Me Up</h3>
                <p>
                  <audio controls width="450" height="250">
                    <source src="horse.ogg" type="audio/ogg">
                    <source src="http://120.48.12.99:8080/examples/YouRiseMeUp.mp3" type="audio/mpeg">
                  </audio>
                </p>
              </div>
            </div>
          </div>
          <div class="col-md-4">
            <div class="thumbnail">
              <!--                            <img alt="300x200" th:src="@{../img/video1}">-->
              <div class="caption" contenteditable="true">
                <h3>Dream Is Possible</h3>
                <p>
                  <audio controls width="450" height="250">
                    <source src="horse.ogg" type="audio/ogg">
                    <source src="http://120.48.12.99:8080/examples/dream.mp3" type="audio/mpeg">
                  </audio>
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
        uploadMusic: null,
      },
      rules: {},
      uploadMusicAction: 'https://jsonplaceholder.typicode.com/posts/',
      uploadMusicfileList: [],
    }
  },
  computed: {},
  watch: {},
  created() {},
  mounted() {},
  methods: {
    submitForm() {
      this.$refs['musicForm'].validate(valid => {
        if (!valid) return
        // TODO 提交表单
      })
    },
    resetForm() {
      this.$refs['musicForm'].resetFields()
    },
    uploadMusicBeforeUpload(file) {
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
