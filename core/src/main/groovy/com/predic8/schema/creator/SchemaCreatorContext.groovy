/* Copyright 2012 predic8 GmbH, www.predic8.com

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License. */

package com.predic8.schema.creator

import com.predic8.schema.Schema
import com.predic8.soamodel.*

class SchemaCreatorContext extends CreatorContext implements Cloneable {

  SchemaCreatorContext(){}
  
  SchemaCreatorContext(CreatorContext ctx){
    this.declNS = ctx.declNS
    this.createLinks = ctx.createLinks
    this.error = ctx.error
  }
  
  def getSchemaId = {1}
	
	Schema subSchema
	
  public Object clone() {
    new SchemaCreatorContext(error:error,declNS:copyDeclNS(),createLinks:createLinks,getSchemaId:getSchemaId,subSchema:subSchema)
  }
}

