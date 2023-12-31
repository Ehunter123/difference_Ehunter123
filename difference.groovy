double size =40;
CSG cube = new Cube(	size,// X dimention
			size,// Y dimention
			size//  Z dimention
			).toCSG()
//create a sphere
CSG sphere = new Sphere(size/20*12.5).toCSG()
// perform a union
CSG cubePlusSphere = cube.difference(sphere);

return [cubePlusSphere , cube.movex(size*1.9), sphere.movey(size*8.5)]