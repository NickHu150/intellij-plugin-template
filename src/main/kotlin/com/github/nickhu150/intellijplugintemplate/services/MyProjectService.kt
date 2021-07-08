package com.github.nickhu150.intellijplugintemplate.services

import com.github.nickhu150.intellijplugintemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
