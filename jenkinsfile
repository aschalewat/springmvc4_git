#!/bin/env groovy
/*
try{
    node (){
        stage('Checkout'){
            try{
                checkout scm
                git url :'https://github.com/aschalewat/GUIChat1.git/'
            }catch (error){
                echo "${error}"
            }
        }
        stage('build'){
            echo 'Building the code'
        }
        stage('QA'){
            echo 'Test is complete'
        }
        stage('PRODUCTION'){
            echo 'Product is ready'
        }
    }
}finally {
    echo "Done!"
}
*/

node {
    def branch = env.BRANCH_NAME
    echo "the new branch ${branch}"
    stage('DEV'){
        echo 'Hello World1'
    }
    stage('QA'){
        echo 'Test is complete'
    }
    stage('PRODUCTION'){
        echo 'Product is ready'
    }
}