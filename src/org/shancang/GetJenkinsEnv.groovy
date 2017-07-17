//src/org/shancang/GetJenkinsEnv.groovy
package org.shancang
def GetHome(args){
	if (args == "prod"){
		echo ${args}
	}else{

		echo "No"
	}
}