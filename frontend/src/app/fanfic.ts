export interface Fanfic {
    id?: number;
    title?: string;
    author?: string;
    url?: string;
    fandom?: string;
    summary?: string;
    dateStarted?: Date;
    dataUploaded?: Date;
    chapterCurrently?: number;
    chapterExpected?: string;
    status?: string; //or create enum
    wordCount?: number;
}
