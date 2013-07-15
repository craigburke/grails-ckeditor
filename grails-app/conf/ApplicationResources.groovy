modules = {
    application {
        resource url:'js/application.js'
    }

    wysiwyg {
        dependsOn 'jquery'
        defaultBundle false

        resource url: 'js/ckeditor/ckeditor.js', disposition: 'head', exclude: 'hashandcache'
        resource url: 'js/wysiwyg.js'
    }

}