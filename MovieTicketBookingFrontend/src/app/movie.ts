import { Time } from "@angular/common";
import { screen } from "./screen";

export class movie{
    id!:number;
    title!:String;
    releaseDate!:Date;
    showCycle!:number;
    rating!:Float32Array;
    language!:String;
    certificate!:String;
    screen!:screen;
}