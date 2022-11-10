const Posts=require('../models/posts');
const {Op}=require('sequelize');


class PostController{

async createPost(req,res){
	
	const {body}=req;
	const data=await Posts.findAll();
	body.id=data.length+1;
	
	if(body.isPublished){
		body.publishedDate=new Date().valueOf();
	}
	const response=await Posts.create(body);
	res.status(201).json(response)
	
}

async getAllPost(req.res){
	const {author,isPublished}=req.query;
	let data=[];
	
	const isBool=(isPublished==='true'||isPublished==='false');
	if(author && isBool){
       data=await Posts.findAll({
		where:{
			[Op.and]:[{author},{isPublished:{isPublished==='true'}}]
		}
	  });
	}else if(auhtor){
		data=await Posts.findAll({
			where:{author}
		})
	}else if(isBool){
		data=await Posts.findAll({
			where:{isPublished:{isPublished==='true'}}
		})
	}else{
		data=await Posts.findAll({});
	}
}

async getPostById(req,res){
	const {id}=req.params;
	const data=await Posts.findOne({id});
	if(data){
		res.status(200).json(data);
	}else{
		res.status(404).json("ID not found");
	}
}

updateById(req,res){
	
	res.status(405).json({message:'Not allowed'});
}
}

module.exports=new PostController();