package com.github.sasuke007.intelljideaplugindemo.services

import com.intellij.openapi.project.Project
import com.github.sasuke007.intelljideaplugindemo.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
