import { User } from "./users";
import { Fanfic } from "./fanfic";
import {LibraryTag} from "./library-tag";

export interface Library {
    id?: number;
    userId: User;
    fanficId: Fanfic;
    readChapters?: number;
    startedDate?: Date;
    lastRead?: Date;
    tag: LibraryTag; // again i dont know// enum
    custumTags:string[];
}
